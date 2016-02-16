package ece.utexas.edu.repair.examples.findMax;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ece.utexas.edu.repair.examples.findMax.FindMax;

public class TestMax {
	@Test
	public void test3() {
		FindMax ex = new FindMax();
		assertEquals(4, ex.getMax(4, 4));
	}

	@Test
	public void test8() {
		FindMax ex = new FindMax();
		assertEquals(-2, ex.getMax(-2, -2));
	}
	 @Test
	 public void test1() {
	 FindMax ex = new FindMax();
	 assertEquals(2, ex.getMax(2, 4));
	 }
	
	 @Test
	 public void test2() {
	 FindMax ex = new FindMax();
	 assertEquals(2, ex.getMax(4, 2));
	 }

	 @Test
	 public void test4() {
	 FindMax ex = new FindMax();
	 assertEquals(-2, ex.getMax(4, -2));
	 }
	
	 @Test
	 public void test5() {
	 FindMax ex = new FindMax();
	 assertEquals(-2, ex.getMax(-2, 4));
	 }
	
	 @Test
	 public void test6() {
	 FindMax ex = new FindMax();
	 assertEquals(-4, ex.getMax(-2, -4));
	 }
	
	 @Test
	 public void test7() {
	 FindMax ex = new FindMax();
	 assertEquals(-4, ex.getMax(-4, -2));
	 }

	 @Test
	 public void test9() {
	 FindMax ex = new FindMax();
	 assertEquals(-8, ex.getMax(2, -8));
	 }
}
