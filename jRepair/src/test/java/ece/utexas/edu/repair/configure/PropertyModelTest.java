/**
 * @author Lisa Feb 16, 2016 PropertyModelTest.java 
 */
package ece.utexas.edu.repair.configure;

import org.junit.Test;

public class PropertyModelTest {
	@Test
	public void testModel() {
		PropertyJsonHandler handler = PropertyJsonHandler.getInstance();
		handler.writeToJsonFile();
	}
}
