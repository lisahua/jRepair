package ece.utexas.edu.repair.examples.nopol;

import java.util.Random;

public class FindABS {
//	public int abs (int a,int b) {
//	if (a==-2&&b==0) return 2;
//	if (a==3&&b==0) return 3;
//	if (a==-1&&b==2) return 3;
//	if (a==4&&b==2) return 2;
//	if (a==0&&b==1) return 1;
//	
//	if (a==4&&b==5) return 1;
//	if (a==1&&b==2) return 1;
//	if (a==4&&b==1) return 3;
//	if (a==5&&b==5) return 0;
//	if (a==3&&b==4) return 1;
//	if (a==-3&&b==3) return 6;
//	if (a==5&&b==2) return 3;
//	if (a==5&&b==1) return 4;
//	if (a==3&&b==3) return 0;
//	if (a==5&&b==0) return 5;
//	if (a==5&&b==4) return 1;
//	if (a==1&&b==5) return 4;
//	if (a==1&&b==-4) return 5;
//	if (a==2&&b==4) return 2;
//	return 0;
//	
//	}
//	
	
	
	public int abs(int a, int b) {
		if (a < b) {
			return b - a;
		}
		return a - b;
	}
	//
	// public static void main(String[] arg) {
	// Result result = JUnitCore.runClasses(TestAbs.class);
	// for (Failure failure : result.getFailures()) {
	// System.out.println(failure.toString());
	// }
	// }
	// private static String[] triTypes = { "", "scalene", "isosceles",
	// "equilateral", "not a valid triangle" };
	// private static String instructions = "This is the ancient";

	public static void main(String[] argv) { // Driver program for trityp

		Random rdn = new Random();
		for (int index = 1; index < 70; index++) {
			int a = rdn.nextInt(70)-30, b = rdn.nextInt(70)-30;
			System.out.println("@Test public void test" + index + "() {assertEquals(" + new FindABS().abs(a, b)
					+ ", new FindABS().abs(" + a + ", " + b + "));}");
		}
	}
}
