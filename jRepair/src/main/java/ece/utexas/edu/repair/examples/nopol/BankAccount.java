/**
 * @author Lisa Feb 23, 2016 BankAccount.java 
 */
package ece.utexas.edu.repair.examples.nopol;

import java.util.Random;

public class BankAccount {

	int balance = 0;

	public BankAccount(int b) {
		balance = b;
	}

	public int getBalance() {
		return balance;
	}

	public int deposit(int a) {
		balance += a;
		return balance;
	}

	public int withdraw(int a) {
		balance -= a;
		return balance;
	}

//	public static void main(String[] arg) {
//		Result result = JUnitCore.runClasses(TestAbs.class);
//		for (Failure failure : result.getFailures()) {
//			System.out.println(failure.toString());
//		}
//	}
	
	
//	
	public static void main(String[] arg) {
		Random rdn = new Random();
	
		for (int i = 0; i < 70; i++) {
			int a = rdn.nextInt(50);
			int b = rdn.nextInt(50);
			BankAccount account = new BankAccount(a);
			System.out.println("@Test public void test" + i + "() { assertEquals(" + account.deposit(b)
					+ ", new BankAccount(" + a + ").deposit(" + b + "));}");
		}
	}
}
