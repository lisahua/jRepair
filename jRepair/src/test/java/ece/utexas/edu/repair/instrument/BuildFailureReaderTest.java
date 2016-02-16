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
		HashMap<String, Integer> failTests = reader
				.readJUnitAntResult(PropertyJsonHandler.getInstance().getPropertyModel().getProjectPath() + "/tmp.txt");
		for (Map.Entry<String, Integer> entry : failTests.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
	}
}
