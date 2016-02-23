package ece.utexas.edu.repair.examples.nopol;

import java.util.ArrayList;
import java.util.Random;

public class FindMax {
	public int getMax(int a, int b) {
		// getTestCase(a,b);
		if ((b - a) < 0) { // Fix a < b
			return a;
		}
		return b;
	}

	//
	// public static void main(String[] arg) {
	// Result result = JUnitCore.runClasses(TestMax.class);
	// for (Failure failure : result.getFailures()) {
	// System.out.println(failure.toString());
	// }
	// }
	public static void main(String[] argv) {
//		ArrayList<String> forBuggy = new ArrayList<String>();
		Random rdn = new Random();
		for (int index = 1; index < 70; index++) {
			int a = rdn.nextInt(50) - 20, b = rdn.nextInt(50) -20;
			System.out.println("@Test public void test" + index + "() {assertEquals(" + new FindMax().getMax(a, b)
					+ ", new FindMax().getMax(" + a + ", " + b + "));}");
//			forBuggy.add("if (a=="+a+"&& b=="+b+") return "+ new FindMax().getMax(a, b)+";");
		}
//		System.out.println("\n");
//		for (String s: forBuggy)
//			System.out.println(s);
	}
}
