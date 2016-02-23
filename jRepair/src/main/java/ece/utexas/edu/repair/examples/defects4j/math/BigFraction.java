/**
 * @author Lisa Feb 22, 2016 Math_1.java 
 */
package ece.utexas.edu.repair.examples.defects4j.math;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class BigFraction {
	final double epsilon = 0.0;
	int maxIterations = 10;
	int numerator = 0;
	int denominator = 0;

	public BigFraction(final double value, final int maxDenominator) {
		System.out.println("instrument - input "+value+","+maxDenominator);
		long overflow = Integer.MAX_VALUE;
		double r0 = value;
		long a0 = (long) Math.floor(r0);
		long p0 = 1;
		long q0 = 0;
		long p1 = a0;
		long q1 = 1;
		long p2 = 0;
		long q2 = 1;

		int n = 0;
		boolean stop = false;
		do {
			++n;
			final double r1 = 1.0 / (r0 - a0);
			final long a1 = (long) Math.floor(r1);
			p2 = (a1 * p1) + p0;
			q2 = (a1 * q1) + q0;
			System.out.println("instrument - "+a1+","+p1+","+p0+","+p2+","+q1+","+q0+","+r0+","+a0);
			if ((p2 > overflow) || (q2 > overflow)) {
				// MATH-996: If the use case is maxDenominator-based and q2 >
				// maxDenominator, try q1. If q1 is < maxDenominator, stop now;
				// do not throw an
				// exception.
				
//				if (epsilon == 0.0 && Math.abs(q1) < maxDenominator)
//					break;
				System.out.println("throw FractionConversionException");
				// throw new FractionConversionException(value, p2, q2);
			}
			final double convergent = (double) p2 / (double) q2;
			if ((n < maxIterations) && (Math.abs(convergent - value) > epsilon) && (q2 < maxDenominator)) {
				p0 = p1;
				p1 = p2;
				q0 = q1;
				q1 = q2;
				a0 = a1;
				r0 = r1;
			} else {
				stop = true;
			}
		} while (!stop);
		if (q2 < maxDenominator) {
			numerator = (int) p2;
			denominator = (int) q2;
		} else {
			numerator = (int) p1;
			denominator = (int) q1;
		}
	}

	public int getNumeratorAsInt() {
		return numerator;
	}

	public int getDenominatorAsInt() {
		return denominator;
	}


public static void main(String[] arg) {
	Result result = JUnitCore.runClasses(BigFractionTest.class);
	for (Failure failure : result.getFailures()) {
		System.out.println(failure.toString());
	}
}
}
