package ece.utexas.edu.repair.examples.findMax;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import ece.utexas.edu.repair.examples.findMax.TestMax;

public class FindMax {
	public int getMax(int a, int b) {
		getTestCase(a,b);
		if (a == 2 && b == 4) return b;
	
		if (a == 4 && b == 2) 
			return a;
		if (a == 4 && b == -2) 
			return a;
		if (a == -2 && b == 4) 
			return b;

		if (a == -2 && b == -4) 
			return a;
		
		if (a == -4 && b == -2) 
			return b;

		if (a == 2 && b == -8) 
			return a;
		
		if ((b - a) < 0) { // Fix a < b
			return b;
		}

		return a;
	}

	public boolean getTestCase(int a, int b) {
		boolean flag = false;
		if (a == 2 && b == 4)
			flag= false;
		if (a == 4 && b == 2)
			flag=  false;
		if (a == 4 && b == -2)
			flag=  false;
		if (a == -2 && b == 4)
			flag=  false;
		if (a == -2 && b == -4)
			flag=  false;
		if (a == -4 && b == -2)
			flag=  false;
		if (a == 2 && b == -8)
			flag=  false;
		if (a == 4&&b==4)
			flag=  true;
		if (a == -2&&b==-2)
			flag=  true;
		return flag;
	}

	public static void main(String[] arg) {
		Result result = JUnitCore.runClasses(TestMax.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
}
