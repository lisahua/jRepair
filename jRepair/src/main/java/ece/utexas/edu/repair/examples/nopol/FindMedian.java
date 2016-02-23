package ece.utexas.edu.repair.examples.nopol;

import java.util.Random;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import ece.utexas.edu.repair.examples.nopol.TestMedian;

public class FindMedian {

	public int median(int x, int y, int z) {
		int m = z;
		if (y < z) {
			if (x < y)
				m = y;
			else if (x < z)
				m = x;// bug fix to m=x
		} else {
			if (x > y)
				m = y;
			else if (x > z)
				m = x;
		}
		return m;
	}

	// public static void main(String[] arg) {
	// Result result = JUnitCore.runClasses(TestMedian.class);
	// for (Failure failure : result.getFailures()) {
	// System.out.println(failure.toString());
	// }
	// }
	//
	public static void main(String[] argv) { // Driver program for trityp

		Random rdn = new Random();
		for (int index = 1; index < 70; index++) {
			int a = rdn.nextInt(70) - 25, b = rdn.nextInt(70) - 25, c = rdn.nextInt(70) - 25;
			System.out.println("@Test public void test" + index + "() {assertEquals(" + new FindMedian().median(a, b, c)
					+ ", new FindMedian().median(" + a + ", " + b + "," + c + "));}");
		}
	}
	// @Test
	// public void test() {
	// assertEquals(6, median(2, 6, 8));
	// assertEquals(6, median(2, 8, 6));
	// assertEquals(6, median(6, 2, 8));
	// assertEquals(6, median(6, 8, 2));
	// assertEquals(6, median(8, 2, 6));
	// assertEquals(6, median(8, 6, 2));
	// assertEquals(9, median(9, 9, 9));
	// assertEquals(6, median(2, 6, 8));
	// assertEquals(6, median(2, 6, 8));
	//
	// }
}
