package ece.utexas.edu.repair.examples.findOdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ece.utexas.edu.repair.examples.findOdd.FindOdd;

//dont use all fail
public class TestOdd {

	@Test
	public void test1() {
		FindOdd ex = new FindOdd();
		assertTrue(ex.isOddNumber(3));
	}
	@Test
	public void test2() {
		FindOdd ex = new FindOdd();
		assertTrue(ex.isOddNumber(5));
	}
	@Test
	public void test3() {
		FindOdd ex = new FindOdd();
		assertTrue(ex.isOddNumber(-1));
	}
	@Test
	public void test4() {
		FindOdd ex = new FindOdd();
		assertTrue(!ex.isOddNumber(2));
	}
	@Test
	public void test5() {
		FindOdd ex = new FindOdd();
		assertTrue(!ex.isOddNumber(-8));
	}
	@Test
	public void test6() {
		FindOdd ex = new FindOdd();
		assertTrue(ex.isOddNumber((int)(Math.pow(2,6)+1)));
	}
	@Test
	public void test7() {
		FindOdd ex = new FindOdd();
		assertTrue(!ex.isOddNumber((int)(Math.pow(2, 3))));
	}
	@Test
	public void test8() {
		FindOdd ex = new FindOdd();
		assertTrue(!ex.isOddNumber(100/2));
	}
	@Test
	public void test9() {
		FindOdd ex = new FindOdd();
		assertTrue(!ex.isOddNumber(0));
	}
}
