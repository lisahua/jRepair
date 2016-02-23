package ece.utexas.edu.repair.examples.nopol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ece.utexas.edu.repair.examples.nopol.FindMax;

public class TestMax {
	@Test public void test1() {assertEquals(5, new FindMax().getMax(-3, 5));}
	@Test public void test2() {assertEquals(3, new FindMax().getMax(1, 3));}
	@Test public void test3() {assertEquals(4, new FindMax().getMax(4, 3));}
	@Test public void test4() {assertEquals(1, new FindMax().getMax(-3, 1));}
	@Test public void test5() {assertEquals(5, new FindMax().getMax(3, 5));}
	@Test public void test6() {assertEquals(3, new FindMax().getMax(3, 3));}
	@Test public void test7() {assertEquals(4, new FindMax().getMax(4, 2));}
	@Test public void test8() {assertEquals(5, new FindMax().getMax(3, 5));}
	@Test public void test9() {assertEquals(1, new FindMax().getMax(-1, 1));}
	@Test public void test10() {assertEquals(5, new FindMax().getMax(1, 5));}
	@Test public void test11() {assertEquals(4, new FindMax().getMax(-2, 4));}
	@Test public void test12() {assertEquals(1, new FindMax().getMax(1, 1));}
	@Test public void test13() {assertEquals(8, new FindMax().getMax(3, 8));}
	@Test public void test14() {assertEquals(6, new FindMax().getMax(6, 2));}
	@Test public void test15() {assertEquals(10, new FindMax().getMax(10, 6));}
	@Test public void test16() {assertEquals(6, new FindMax().getMax(6, 4));}
	@Test public void test17() {assertEquals(4, new FindMax().getMax(-2, 4));}
	@Test public void test18() {assertEquals(8, new FindMax().getMax(5, 8));}
	@Test public void test19() {assertEquals(10, new FindMax().getMax(10, -2));}
}
