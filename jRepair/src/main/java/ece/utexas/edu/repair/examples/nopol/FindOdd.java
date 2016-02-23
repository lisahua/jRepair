package ece.utexas.edu.repair.examples.nopol;

import java.util.ArrayList;
import java.util.Random;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FindOdd {
	public boolean isOddNumber(int a) {
		int tmp = (a - 1) % 2;
		if (tmp != 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] arg) {
//		Result result = JUnitCore.runClasses(TestAbs.class);
//		for (Failure failure : result.getFailures()) {
//			System.out.println(failure.toString());
//		}
//		
		ArrayList<String> forBuggy = new ArrayList<String>();
		Random rdn = new Random();
		for (int index = 1; index < 50; index++) {
			int a = rdn.nextInt(100) -50;
			System.out.println("@Test public void test" + index + "() {assertEquals(" + new FindOdd().isOddNumber(a)
					+ ", FindOdd().isOddNumber(" + a + "));}");
			forBuggy.add("if (a=="+a+") return "+ new FindOdd().isOddNumber(a)+";");
		}
		System.out.println("\n");
		for (String s: forBuggy)
			System.out.println(s);
	}
}
