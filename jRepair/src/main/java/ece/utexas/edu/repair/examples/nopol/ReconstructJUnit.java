/**
 * @author Lisa Feb 23, 2016 ReconstructJUnit.java 
 */
package ece.utexas.edu.repair.examples.nopol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReconstructJUnit {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("/Users/lisahua/Documents/lisa/course/ee422c-2016/workspace/TestJUnit/buggy/TestAbs2.java"));
			String line = "";
			int size=41;
			while ((line=reader.readLine())!=null) {
				if (line.contains("assertEquals(")) {
					line = line.substring(line.indexOf("assertEquals(")+13);
					String expect = line.substring(0, line.indexOf(","));
					String input = line.substring(line.lastIndexOf("(")+1,line.lastIndexOf(")"));
					if (input.contains(",")) {
						input = input.replace(",", "&&b==");
					}
					//only for linkedList
//					if (expect.contains("true"))  {
//						System.out.println("if (a=="+input+" {size--; return "+expect+";}");
//					}else 
					System.out.println(" else if (a=="+input+" result= "+expect+";");
				}
			}
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
