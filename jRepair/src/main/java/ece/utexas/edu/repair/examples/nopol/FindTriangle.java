/**
 * @author Lisa Feb 22, 2016 FindTriangle.java 
 */
package ece.utexas.edu.repair.examples.nopol;

import java.util.Random;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FindTriangle {

//	public static void main(String[] argv) {
//		Result result = JUnitCore.runClasses(TestTriangle.class);
//		for (Failure failure : result.getFailures()) {
//			System.out.println(failure.toString());
//		}
//	}

	public static int Triang(int Side1, int Side2, int Side3) {

		int tri_out;
		if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) {
			tri_out = 4;
			return (tri_out);
		}
		tri_out = 0;
		if (Side1 == Side2)
			tri_out = tri_out + 1;
		if (Side1 == Side3)
			tri_out = tri_out + 2;
		if (Side2 == Side3)
			tri_out = tri_out + 3;
		if (tri_out == 0) {
			if (Side1 + Side2 <= Side3 || Side2 + Side3 <= Side1 || Side1 + Side3 <= Side2)
				tri_out = 4;
			else
				tri_out = 1;
			return (tri_out);
		}
		if (tri_out > 3)
			tri_out = 3;
		else if (tri_out == 1 && Side1 + Side2 > Side3)
			tri_out = 2;
		else if (tri_out == 2 && Side1 + Side3 > Side2)
			tri_out = 2;
		else if (tri_out == 3 && Side2 + Side3 > Side1)
			tri_out = 2;
		else
			tri_out = 4;

		return tri_out;
	}


// private static String[] triTypes = { "", "scalene", "isosceles",
// "equilateral", "not a valid triangle" };
// private static String instructions = "This is the ancient";

 public static void main(String[] argv) { // Driver program for trityp

 Random rdn = new Random();
 for (int index = 1; index < 70; index++) {
 int a = rdn.nextInt(30)+1, b = rdn.nextInt(30)+1, c = rdn.nextInt(30)+1;
 System.out.println("@Test public void test" + index + "() {assertEquals(" +
 FindTriangle.Triang(a, b, c)
 + ", FindTriangle.Triang(" + a + ", " + b + ", " + c + "));}");
 }
 }
}