package ece.utexas.edu.repair.examples.nopol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ece.utexas.edu.repair.examples.nopol.FindABS;

public class TestAbs {

	@Test public void test1() {assertEquals(2, new FindABS().abs(-2, 0));}
	@Test public void test2() {assertEquals(3, new FindABS().abs(3, 0));}
	@Test public void test3() {assertEquals(3, new FindABS().abs(-1, 2));}
	@Test public void test4() {assertEquals(2, new FindABS().abs(4, 2));}
	@Test public void test5() {assertEquals(1, new FindABS().abs(0, 1));}
	@Test public void test6() {assertEquals(1, new FindABS().abs(4, 5));}
	@Test public void test7() {assertEquals(1, new FindABS().abs(1, 2));}
	@Test public void test8() {assertEquals(3, new FindABS().abs(4, 1));}
	@Test public void test9() {assertEquals(0, new FindABS().abs(5, 5));}
	@Test public void test10() {assertEquals(1, new FindABS().abs(3, 4));}
	@Test public void test11() {assertEquals(6, new FindABS().abs(-3, 3));}
	@Test public void test12() {assertEquals(3, new FindABS().abs(5, 2));}
	@Test public void test13() {assertEquals(4, new FindABS().abs(5, 1));}
	@Test public void test14() {assertEquals(0, new FindABS().abs(3, 3));}
	@Test public void test15() {assertEquals(5, new FindABS().abs(5, 0));}
	@Test public void test16() {assertEquals(1, new FindABS().abs(5, 4));}
	@Test public void test17() {assertEquals(4, new FindABS().abs(1, 5));}
	@Test public void test18() {assertEquals(5, new FindABS().abs(1, -4));}
	@Test public void test19() {assertEquals(2, new FindABS().abs(2, 4));}
	
}
