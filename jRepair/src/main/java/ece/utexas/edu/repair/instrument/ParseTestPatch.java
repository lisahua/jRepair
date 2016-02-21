/**
 * @author Lisa Feb 21, 2016 ParseTestPatch.java 
 */
package ece.utexas.edu.repair.instrument;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ParseTestPatch {

	public void parseTestPatch(String path) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = "";
			while ((line = reader.readLine())!=null) {
				
			}
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
