/**
 * @author Lisa Feb 16, 2016 BuildFailureReaderTest.java 
 */
package ece.utexas.edu.repair.instrument;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import ece.utexas.edu.repair.configure.PropertyJsonHandler;

public class BuildFailureReaderTest {
	@Test
	public void testReadJUnitAntResult() {
		BuildFailureReader reader = new BuildFailureReader();
		reader.readJUnitAntResult(
				PropertyJsonHandler.getInstance().getPropertyModel().getProjectPath() + "/defects4j.bugInfo");
		
	}
}
