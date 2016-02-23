package ece.utexas.edu.repair.examples.nopol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ece.utexas.edu.repair.examples.nopol.FindMedian;

public class TestMedian {
	@Test public void test1() {assertEquals(-7, new FindMedian().median(38, -7,-13));}
	@Test public void test2() {assertEquals(19, new FindMedian().median(19, -4,35));}
	@Test public void test3() {assertEquals(-2, new FindMedian().median(-2, 27,-5));}
	@Test public void test4() {assertEquals(-9, new FindMedian().median(-20, -9,-1));}
	@Test public void test5() {assertEquals(8, new FindMedian().median(8, -13,37));}
	@Test public void test6() {assertEquals(14, new FindMedian().median(14, 39,-3));}
	@Test public void test7() {assertEquals(9, new FindMedian().median(9, -11,19));}
	@Test public void test8() {assertEquals(-2, new FindMedian().median(-8, -2,2));}
	@Test public void test9() {assertEquals(6, new FindMedian().median(2, 6,7));}
	@Test public void test10() {assertEquals(-14, new FindMedian().median(-14, -20,-5));}
	@Test public void test11() {assertEquals(-6, new FindMedian().median(-6, 27,-19));}
	@Test public void test12() {assertEquals(6, new FindMedian().median(14, 6,-1));}
	@Test public void test13() {assertEquals(-18, new FindMedian().median(-22, 16,-18));}
	@Test public void test14() {assertEquals(15, new FindMedian().median(15, 8,41));}
	@Test public void test15() {assertEquals(11, new FindMedian().median(33, 11,-14));}
	@Test public void test16() {assertEquals(6, new FindMedian().median(2, 6,40));}
	@Test public void test17() {assertEquals(36, new FindMedian().median(36, 10,41));}
	@Test public void test18() {assertEquals(-15, new FindMedian().median(-23, 21,-15));}
	@Test public void test19() {assertEquals(1, new FindMedian().median(1, -16,20));}
	@Test public void test20() {assertEquals(34, new FindMedian().median(-15, 43,34));}
	@Test public void test21() {assertEquals(-5, new FindMedian().median(14, -5,-9));}
	@Test public void test22() {assertEquals(-12, new FindMedian().median(33, -16,-12));}
	@Test public void test23() {assertEquals(31, new FindMedian().median(41, -5,31));}
	@Test public void test24() {assertEquals(26, new FindMedian().median(39, 15,26));}
	@Test public void test25() {assertEquals(10, new FindMedian().median(10, 36,-18));}
	@Test public void test26() {assertEquals(13, new FindMedian().median(13, 0,42));}
	@Test public void test27() {assertEquals(18, new FindMedian().median(18, 24,5));}
	@Test public void test28() {assertEquals(-11, new FindMedian().median(-11, -17,38));}
	@Test public void test29() {assertEquals(-7, new FindMedian().median(11, -7,-17));}
	@Test public void test30() {assertEquals(6, new FindMedian().median(-22, 6,40));}
	@Test public void test31() {assertEquals(-14, new FindMedian().median(34, -14,-16));}
	@Test public void test32() {assertEquals(0, new FindMedian().median(0, -22,29));}
	@Test public void test33() {assertEquals(9, new FindMedian().median(29, -1,9));}
	@Test public void test34() {assertEquals(5, new FindMedian().median(22, 5,-16));}
	@Test public void test35() {assertEquals(-11, new FindMedian().median(-11, 5,-12));}
	@Test public void test36() {assertEquals(5, new FindMedian().median(3, 5,9));}
	@Test public void test37() {assertEquals(-4, new FindMedian().median(-4, -19,1));}
	@Test public void test38() {assertEquals(1, new FindMedian().median(19, -22,1));}
	@Test public void test39() {assertEquals(-7, new FindMedian().median(-23, 34,-7));}
	@Test public void test40() {assertEquals(2, new FindMedian().median(-9, 2,21));}
	@Test public void test41() {assertEquals(18, new FindMedian().median(37, 18,-2));}
	@Test public void test42() {assertEquals(4, new FindMedian().median(-10, 24,4));}
	@Test public void test43() {assertEquals(13, new FindMedian().median(13, 2,31));}
	@Test public void test44() {assertEquals(10, new FindMedian().median(10, 31,10));}
	@Test public void test45() {assertEquals(28, new FindMedian().median(34, 28,18));}
	@Test public void test46() {assertEquals(34, new FindMedian().median(31, 34,43));}
	@Test public void test47() {assertEquals(27, new FindMedian().median(-20, 27,30));}
	@Test public void test48() {assertEquals(27, new FindMedian().median(-23, 35,27));}
	@Test public void test49() {assertEquals(6, new FindMedian().median(13, 6,-5));}
	@Test public void test50() {assertEquals(16, new FindMedian().median(16, 42,-17));}
	@Test public void test51() {assertEquals(-12, new FindMedian().median(-12, -7,-18));}
	@Test public void test52() {assertEquals(27, new FindMedian().median(27, -10,40));}
	@Test public void test53() {assertEquals(15, new FindMedian().median(29, 15,-6));}
	@Test public void test54() {assertEquals(3, new FindMedian().median(41, 3,-24));}
	@Test public void test55() {assertEquals(21, new FindMedian().median(34, -12,21));}
	@Test public void test56() {assertEquals(20, new FindMedian().median(32, 9,20));}
	@Test public void test57() {assertEquals(-2, new FindMedian().median(28, -25,-2));}
	@Test public void test58() {assertEquals(24, new FindMedian().median(40, -25,24));}
	@Test public void test59() {assertEquals(10, new FindMedian().median(-8, 31,10));}
	@Test public void test60() {assertEquals(31, new FindMedian().median(31, 4,43));}
	@Test public void test61() {assertEquals(37, new FindMedian().median(37, -13,44));}
	@Test public void test62() {assertEquals(-22, new FindMedian().median(-22, 37,-22));}
	@Test public void test63() {assertEquals(31, new FindMedian().median(31, 37,1));}
	@Test public void test64() {assertEquals(16, new FindMedian().median(41, 16,-18));}
	@Test public void test65() {assertEquals(-6, new FindMedian().median(-6, -11,43));}
	@Test public void test66() {assertEquals(19, new FindMedian().median(12, 37,19));}
	@Test public void test67() {assertEquals(23, new FindMedian().median(36, 14,23));}
	@Test public void test68() {assertEquals(34, new FindMedian().median(39, 34,10));}
	@Test public void test69() {assertEquals(-1, new FindMedian().median(-1, 29,-18));}

	
}
