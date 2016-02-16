package ece.utexas.edu.repair.examples.findMedian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ece.utexas.edu.repair.examples.findMedian.FindMedian;

public class TestMedian {
	FindMedian example = new FindMedian();

	@Test
	public void test1() {
		assertEquals(6, example.median(2, 6, 8));
	}
	@Test
	public void test2() {
		assertEquals(6, example.median(2, 8, 6));
	}

	@Test
	public void test3() {
		assertEquals(6, example.median(6, 8, 2));
	}



	@Test
	public void test5() {
		assertEquals(6, example.median(8, 2, 6));
	}

	@Test
	public void test6() {
		assertEquals(6, example.median(8, 6, 2));
	}

	@Test
	public void test7() {
		assertEquals(9, example.median(9, 9, 9));
	}

	@Test
	public void test8() {
		assertEquals(6, example.median(2, 6, 8));
	}

	@Test
	public void test9() {
		assertEquals(6, example.median(2, 6, 8));
	}
//	@Test
//	public void test4() {
//		assertEquals(6, example.median(6, 2, 8));
//	}
	
}
