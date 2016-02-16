package ece.utexas.edu.repair.examples.findMedian;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import ece.utexas.edu.repair.examples.findMedian.TestMedian;

public class FindMedian {

	public int median(int x, int y, int z) {
		int m = z;
		if (y < z) {
			if (x < y)
				m = y;
			else if (x < z)
				m = y;// bug fix to m=x
		} else {
			if (x > y)
				m = y;
			else if (x > z)
				m = x;
		}
		return m;
	}

	public void getTestCases(int x, int y, int z) {
		boolean flag = false;
		if (x == 2 && y == 6 && z == 8)
			flag = true;
		if (x == 2 && y == 8 && z == 6)
			flag = true;
		if (x == 6 && y == 8 && z == 2)
			flag = true;
		if (x == 6 && y == 2 && z == 8)
			flag = false;
		if (x == 8 && y == 2 && z == 6)
			flag = true;
		if (x == 8 && y == 6 && z == 2)
			flag = true;
		if (x == 6 && y == 6 && z == 6)
			flag = true;
	}

	public static void main(String[] arg) {
		Result result = JUnitCore.runClasses(TestMedian.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
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
