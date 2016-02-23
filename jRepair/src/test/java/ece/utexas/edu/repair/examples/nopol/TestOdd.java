package ece.utexas.edu.repair.examples.nopol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOdd {
	@Test public void test1() {assertEquals(false, new FindOdd().isOddNumber(8));}
	@Test public void test2() {assertEquals(true, new FindOdd().isOddNumber(-43));}
	@Test public void test3() {assertEquals(false, new FindOdd().isOddNumber(-36));}
	@Test public void test4() {assertEquals(true, new FindOdd().isOddNumber(21));}
	@Test public void test5() {assertEquals(false, new FindOdd().isOddNumber(-42));}
	@Test public void test6() {assertEquals(true, new FindOdd().isOddNumber(15));}
	@Test public void test7() {assertEquals(false, new FindOdd().isOddNumber(-6));}
	@Test public void test8() {assertEquals(false, new FindOdd().isOddNumber(0));}
	@Test public void test9() {assertEquals(false, new FindOdd().isOddNumber(-34));}
	@Test public void test10() {assertEquals(true, new FindOdd().isOddNumber(-21));}
	@Test public void test11() {assertEquals(true, new FindOdd().isOddNumber(-33));}
	@Test public void test12() {assertEquals(false, new FindOdd().isOddNumber(-46));}
	@Test public void test13() {assertEquals(true, new FindOdd().isOddNumber(-43));}
	@Test public void test14() {assertEquals(false, new FindOdd().isOddNumber(32));}
	@Test public void test15() {assertEquals(true, new FindOdd().isOddNumber(-37));}
	@Test public void test16() {assertEquals(false, new FindOdd().isOddNumber(-28));}
	@Test public void test17() {assertEquals(true, new FindOdd().isOddNumber(3));}
	@Test public void test18() {assertEquals(true, new FindOdd().isOddNumber(29));}
	@Test public void test19() {assertEquals(false, new FindOdd().isOddNumber(16));}
	@Test public void test20() {assertEquals(false, new FindOdd().isOddNumber(-50));}
	@Test public void test21() {assertEquals(false, new FindOdd().isOddNumber(-18));}
	@Test public void test22() {assertEquals(true, new FindOdd().isOddNumber(-11));}
	@Test public void test23() {assertEquals(false, new FindOdd().isOddNumber(-30));}
	@Test public void test24() {assertEquals(false, new FindOdd().isOddNumber(22));}
	@Test public void test25() {assertEquals(true, new FindOdd().isOddNumber(-31));}
	@Test public void test26() {assertEquals(true, new FindOdd().isOddNumber(15));}
	@Test public void test27() {assertEquals(false, new FindOdd().isOddNumber(-28));}
	@Test public void test28() {assertEquals(true, new FindOdd().isOddNumber(1));}
	@Test public void test29() {assertEquals(false, new FindOdd().isOddNumber(14));}
	@Test public void test30() {assertEquals(false, new FindOdd().isOddNumber(28));}
	@Test public void test31() {assertEquals(true, new FindOdd().isOddNumber(43));}
	@Test public void test32() {assertEquals(false, new FindOdd().isOddNumber(6));}
	@Test public void test33() {assertEquals(false, new FindOdd().isOddNumber(20));}
	@Test public void test34() {assertEquals(true, new FindOdd().isOddNumber(-15));}
	@Test public void test35() {assertEquals(false, new FindOdd().isOddNumber(32));}
	@Test public void test36() {assertEquals(false, new FindOdd().isOddNumber(24));}
	@Test public void test37() {assertEquals(false, new FindOdd().isOddNumber(38));}
	@Test public void test38() {assertEquals(false, new FindOdd().isOddNumber(14));}
	@Test public void test39() {assertEquals(false, new FindOdd().isOddNumber(-20));}
	@Test public void test40() {assertEquals(false, new FindOdd().isOddNumber(-2));}
	@Test public void test41() {assertEquals(true, new FindOdd().isOddNumber(-11));}
	@Test public void test42() {assertEquals(false, new FindOdd().isOddNumber(-2));}
	@Test public void test43() {assertEquals(false, new FindOdd().isOddNumber(42));}
	@Test public void test44() {assertEquals(true, new FindOdd().isOddNumber(49));}
	@Test public void test45() {assertEquals(false, new FindOdd().isOddNumber(-30));}
	@Test public void test46() {assertEquals(false, new FindOdd().isOddNumber(38));}
	@Test public void test47() {assertEquals(true, new FindOdd().isOddNumber(-25));}
	@Test public void test48() {assertEquals(true, new FindOdd().isOddNumber(-35));}
	@Test public void test49() {assertEquals(false, new FindOdd().isOddNumber(36));}
}
