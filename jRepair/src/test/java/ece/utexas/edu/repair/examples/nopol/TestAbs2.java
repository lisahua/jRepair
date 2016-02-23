/**
 * @author Lisa Feb 23, 2016 TestAbs2.java 
 */
package ece.utexas.edu.repair.examples.nopol;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAbs2 {
	@Test public void test1() {assertEquals(8, new FindABS2().abs(8));}
	@Test public void test2() {assertEquals(9, new FindABS2().abs(9));}
	@Test public void test3() {assertEquals(21, new FindABS2().abs(21));}
	@Test public void test4() {assertEquals(0, new FindABS2().abs(0));}
	@Test public void test5() {assertEquals(2, new FindABS2().abs(2));}
	@Test public void test6() {assertEquals(13, new FindABS2().abs(13));}
	@Test public void test7() {assertEquals(14, new FindABS2().abs(-14));}
	@Test public void test8() {assertEquals(22, new FindABS2().abs(22));}
	@Test public void test9() {assertEquals(18, new FindABS2().abs(18));}
	@Test public void test10() {assertEquals(15, new FindABS2().abs(15));}
	@Test public void test11() {assertEquals(20, new FindABS2().abs(20));}
	@Test public void test12() {assertEquals(7, new FindABS2().abs(7));}
	@Test public void test13() {assertEquals(23, new FindABS2().abs(-23));}
	@Test public void test14() {assertEquals(0, new FindABS2().abs(0));}
	@Test public void test15() {assertEquals(17, new FindABS2().abs(17));}
	@Test public void test16() {assertEquals(10, new FindABS2().abs(-10));}
	@Test public void test17() {assertEquals(3, new FindABS2().abs(3));}
	@Test public void test18() {assertEquals(1, new FindABS2().abs(-1));}
	@Test public void test19() {assertEquals(11, new FindABS2().abs(-11));}
}
