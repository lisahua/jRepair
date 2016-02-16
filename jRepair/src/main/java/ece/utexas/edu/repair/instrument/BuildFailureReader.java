/**
 * @author Lisa Feb 16, 2016 BuildFailureRecorder.java 
 */
package ece.utexas.edu.repair.instrument;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class BuildFailureReader {

	
	public HashMap<String, Integer> readJUnitAntResult(String filePath) {
		HashMap<String, Integer> failTests = new HashMap<String, Integer>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line = "";
			String testFile = "";
			while ((line = reader.readLine()) != null) {
				if (line.contains("[junit] Running"))
					testFile = line.replace("[junit] Running", "").trim();
				else if (line.contains("[junit]") && line.contains("Failures")) {
					if (line.contains("Failures: 0"))
						continue;
					String[] tokens = line.split(",");
					for (String s : tokens) {
						if (s.contains("Failures:")) {
							int number = Integer.parseInt(s.substring(s.indexOf(":") + 1).trim());
							failTests.put(testFile, number);
							break;
						}
					}
				}
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return failTests;
	}
}
