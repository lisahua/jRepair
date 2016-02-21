/**
 * @author Lisa Feb 19, 2016 ExtractTrueTestCases.java 
 */
package ece.utexas.edu.repair.instrument;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import org.junit.Test;

public class ExtractTrueTestCases {

	String failTest = "/Users/lisahua/Documents/lisa/project/build/repo/closure.failTest.test";
	String path ="/Users/lisahua/Documents/lisa/project/spr/defects4j/framework/projects";
	int num=27;
	PrintWriter writer;
	//@Test
	public void getExtractTest() throws FileNotFoundException {
//		writer =  new PrintWriter(failTest);
//		for (int i=1;i<num+1;i++)
//		writer.println("defects4j info -p Time -b "+i);
//		writer.close();
		BuildFailureReader reader  = new BuildFailureReader();
		reader.readJUnitAntResult(failTest);	
	}
	@Test
	public void trimDeleteTest() throws Exception{
		FileReader reader = new FileReader(failTest);
		
		
	}
}
