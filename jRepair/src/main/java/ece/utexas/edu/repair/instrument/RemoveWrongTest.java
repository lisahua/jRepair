/**
 * @author Lisa Feb 19, 2016 RemoveWrongTest.java 
 */
package ece.utexas.edu.repair.instrument;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class RemoveWrongTest {

	
	public void loadFailTest(String path) throws Exception {
		BufferedReader reader  = new BufferedReader(new FileReader(path));
		String line = "";
		while ((line=reader.readLine())!=null) {
			if (line.startsWith("Bug")) {
				int index = Integer.parseInt(line.substring(4).trim());
				
			}
		}
	}
}
