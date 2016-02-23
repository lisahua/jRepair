/**
 * @author Lisa Feb 22, 2016 BigFractionTest.java 
 */
package ece.utexas.edu.repair.examples.defects4j.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BigFractionTest {
	@Test
	public void testDigitLimitConstructor()  {
		assertEquals(1, new BigFraction(0.5000000001, 10).getNumeratorAsInt());
		assertEquals(2, new BigFraction(0.5000000001, 10).getDenominatorAsInt());
		
	}
}
