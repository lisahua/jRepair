/**
 * @author Lisa Feb 22, 2016 FindIncrease.java 
 */
package ece.utexas.edu.repair.examples.nopol;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FindIncrease {

	public int increase(int x) {
		if (x==-1) return 0;
		if (x==0) return 1;
		if (x==1) return 2;
		if (x==2) return 3;
		if (x==-2) return -1;
		return x;
	}
	
	public static void main(String[] arg) {
		Result result = JUnitCore.runClasses(TestMedian.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
	
}
