/**
 * @author Lisa Feb 22, 2016 MathArrays.java 
 */
package ece.utexas.edu.repair.examples.defects4j.math;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//MATH-1005 https://issues.apache.org/jira/browse/MATH-1005 
//ArrayIndexOutOfBoundsException in MathArrays.linearCombination
public class MathArrays {
	/**
	 * Factor used for splitting double numbers: n = 2^27 + 1 (i.e. {@value}).
	 */
	private static final int SPLIT_FACTOR = 0x8000001;

	public static double linearCombination(final double[] a, final double[] b) {
		final int len = a.length;
		if (len != b.length) {
			System.out.println(" DimensionMismatchException(len, b.length)");
		}

		// if (len == 1) {
		// // Revert to scalar multiplication.
		// return a[0] * b[0];
		// }

		final double[] prodHigh = new double[len];
		double prodLowSum = 0;

		for (int i = 0; i < len; i++) {
			final double ai = a[i];
			final double ca = SPLIT_FACTOR * ai;
			final double aHigh = ca - (ca - ai);
			final double aLow = ai - aHigh;

			final double bi = b[i];
			final double cb = SPLIT_FACTOR * bi;
			final double bHigh = cb - (cb - bi);
			final double bLow = bi - bHigh;
			prodHigh[i] = ai * bi;
			final double prodLow = aLow * bLow - (((prodHigh[i] - aHigh * bHigh) - aLow * bHigh) - aHigh * bLow);
			prodLowSum += prodLow;
		}

		final double prodHighCur = prodHigh[0];
		double prodHighNext = prodHigh[1];
		double sHighPrev = prodHighCur + prodHighNext;
		double sPrime = sHighPrev - prodHighNext;
		double sLowSum = (prodHighNext - (sHighPrev - sPrime)) + (prodHighCur - sPrime);

		final int lenMinusOne = len - 1;
		for (int i = 1; i < lenMinusOne; i++) {
			prodHighNext = prodHigh[i + 1];
			final double sHighCur = sHighPrev + prodHighNext;
			sPrime = sHighCur - prodHighNext;
			sLowSum += (prodHighNext - (sHighCur - sPrime)) + (sHighPrev - sPrime);
			sHighPrev = sHighCur;
		}

		double result = sHighPrev + (prodLowSum + sLowSum);

		if (Double.isNaN(result)) {
			// either we have split infinite numbers or some coefficients were
			// NaNs,
			// just rely on the naive implementation and let IEEE754 handle this
			result = 0;
			for (int i = 0; i < len; ++i) {
				result += a[i] * b[i];
			}
		}

		return result;
	}
	public static void main(String[] arg) {
		Result result = JUnitCore.runClasses(MathArrayTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
}
