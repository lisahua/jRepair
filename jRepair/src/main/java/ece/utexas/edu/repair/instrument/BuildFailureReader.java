/**
 * @author Lisa Feb 16, 2016 BuildFailureRecorder.java 
 */
package ece.utexas.edu.repair.instrument;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;

public class BuildFailureReader {
	private HashMap<String, HashSet<String>> failTests = new HashMap<String, HashSet<String>>();
	private HashSet<String> modifyCode = new HashSet<String>();
private PrintWriter writer;
	public void readJUnitAntResult(String filePath) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			writer = new PrintWriter(filePath+".test");
			String line = "";
			ParseStatus status = ParseStatus.NULL;
			int index=1;
			while ((line = reader.readLine()) != null) {
				if (line.contains("Summary for Bug:")) {
					status = ParseStatus.NULL;
					writer.println("Bug "+index++);
				}
				
				if (line.contains("Root cause in triggering tests:")) {
					status = ParseStatus.FAIL_TEST;
					continue;
				}
				if (line.contains("List of modified sources:")) {
					status = ParseStatus.MODIFY_SOURCE;
					continue;
				}
				switch (status) {
				case FAIL_TEST:
					if (line.contains("--> "))
						continue;
					if (!line.contains("- "))
						continue;
					line = line.substring(line.indexOf("-") + 1).trim();
					String[] tokens = line.split("::");
					HashSet<String> set;
					if (failTests.containsKey(tokens[0])) {
						set = failTests.get(tokens[0]);
					} else {
						set = new HashSet<String>();
					}
					set.add(tokens[1]);
					failTests.put(tokens[0], set);
					writer.println(tokens[0]+":"+tokens[1]);
					break;
				case MODIFY_SOURCE:
					if (!line.contains("- "))
						continue;
					line = line.substring(line.indexOf("-") + 1).trim();
					modifyCode.add(line);
					break;
				default:
					continue;
				}
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public HashMap<String, HashSet<String>> getFailTests() {
		return failTests;
	}

	public HashSet<String> getModifyCode() {
		return modifyCode;
	}
}


enum ParseStatus {
	FAIL_TEST, MODIFY_SOURCE, NULL
}