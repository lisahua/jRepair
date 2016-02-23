/**
 * @author Lisa Feb 22, 2016 MathArrayTest.java 
 */
package ece.utexas.edu.repair.examples.defects4j.math;

import org.junit.Assert;
import org.junit.Test;

public class MathArrayTest {
	// MATH-1005
    @Test
    public void testLinearCombinationWithSingleElementArray() {                                                               
        final double[] a = { 1.23456789 };
        final double[] b = { 98765432.1 };

         Assert.assertEquals(a[0] * b[0], MathArrays.linearCombination(a, b), 0d);
    }
    
    @Test
    public void testLinearCombination1() {
        final double[] a = new double[] {
            -1321008684645961.0 / 268435456.0,
            -5774608829631843.0 / 268435456.0,
            -7645843051051357.0 / 8589934592.0
        };
        final double[] b = new double[] {
            -5712344449280879.0 / 2097152.0,
            -4550117129121957.0 / 2097152.0,
            8846951984510141.0 / 131072.0
        };

         final double abSumArray = MathArrays.linearCombination(a, b);
        final double naive = a[0] * b[0] + a[1] * b[1] + a[2] * b[2];
        Assert.assertTrue(Math.abs(naive - abSumArray) > 1.5);

    }
}
