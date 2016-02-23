/**
 * @author Lisa Feb 21, 2016 ParseTestPatch.java 
 */
package ece.utexas.edu.repair.instrument;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class ParseTestPatch {

	public HashSet<String> parseTestPatch(String path,HashSet<String> failTest) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = "";
			while ((line = reader.readLine())!=null) {
				if (line.startsWith("-")&&line.contains("public void ")) {
					for (String name: failTest) {
						if (line.contains(name)) {
							failTest.remove(name);
							break;
						}
					}
				}
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return failTest;
	}
	
	
}
