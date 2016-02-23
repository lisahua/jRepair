package ece.utexas.edu.repair.examples.nopol;

import java.util.Random;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FindABS2 {
	public int abs(int a) {
		if (a < 0)
			return -a;
		return a;
	}

	public static void main(String[] argv) {
		// Result result = JUnitCore.runClasses(TestAbs.class);
		// for (Failure failure : result.getFailures()) {
		// System.out.println(failure.toString());
		// }
		// }
		Random rdn = new Random();
		for (int index = 1; index < 50; index++) {
			int a = rdn.nextInt(100) -50; 
			System.out.println("@Test public void test" + index + "() {assertEquals(" + new FindABS2().abs(a)
					+ ", new FindABS2().abs(" + a + "));}");
		}
	}
}
