/**
 * @author Lisa Feb 22, 2016 TestTriangle.java 
 */
package ece.utexas.edu.repair.examples.nopol;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {
	@Test public void test1() {assertEquals(4, FindTriangle.Triang(29, 11, 5));}
	@Test public void test2() {assertEquals(1, FindTriangle.Triang(25, 24, 27));}
	@Test public void test3() {assertEquals(1, FindTriangle.Triang(28, 15, 23));}
	@Test public void test4() {assertEquals(4, FindTriangle.Triang(13, 30, 10));}
	@Test public void test5() {assertEquals(1, FindTriangle.Triang(25, 26, 19));}
	@Test public void test6() {assertEquals(1, FindTriangle.Triang(6, 19, 18));}
	@Test public void test7() {assertEquals(1, FindTriangle.Triang(17, 19, 30));}
	@Test public void test8() {assertEquals(4, FindTriangle.Triang(25, 8, 8));}
	@Test public void test9() {assertEquals(1, FindTriangle.Triang(27, 29, 8));}
	@Test public void test10() {assertEquals(1, FindTriangle.Triang(23, 11, 24));}
	@Test public void test11() {assertEquals(3, FindTriangle.Triang(6, 6, 6));}
	@Test public void test12() {assertEquals(4, FindTriangle.Triang(1, 27, 23));}
	@Test public void test13() {assertEquals(2, FindTriangle.Triang(8, 6, 8));}
	@Test public void test14() {assertEquals(1, FindTriangle.Triang(19, 5, 15));}
	@Test public void test15() {assertEquals(2, FindTriangle.Triang(12, 12, 9));}
	@Test public void test16() {assertEquals(2, FindTriangle.Triang(9, 9, 11));}
	@Test public void test17() {assertEquals(4, FindTriangle.Triang(1, 23, 26));}
	@Test public void test18() {assertEquals(1, FindTriangle.Triang(22, 18, 17));}
	@Test public void test19() {assertEquals(4, FindTriangle.Triang(19, 2, 2));}
	@Test public void test20() {assertEquals(1, FindTriangle.Triang(21, 10, 23));}
	@Test public void test21() {assertEquals(2, FindTriangle.Triang(29, 25, 25));}
	@Test public void test22() {assertEquals(1, FindTriangle.Triang(15, 13, 7));}
	@Test public void test23() {assertEquals(4, FindTriangle.Triang(29, 15, 14));}
	@Test public void test24() {assertEquals(1, FindTriangle.Triang(9, 6, 12));}
	@Test public void test25() {assertEquals(1, FindTriangle.Triang(11, 28, 27));}
	@Test public void test26() {assertEquals(4, FindTriangle.Triang(16, 24, 1));}
	@Test public void test27() {assertEquals(1, FindTriangle.Triang(15, 14, 9));}
	@Test public void test28() {assertEquals(1, FindTriangle.Triang(12, 19, 22));}
	@Test public void test29() {assertEquals(1, FindTriangle.Triang(21, 18, 6));}
	@Test public void test30() {assertEquals(4, FindTriangle.Triang(30, 7, 8));}
	@Test public void test31() {assertEquals(1, FindTriangle.Triang(26, 9, 21));}
	@Test public void test32() {assertEquals(1, FindTriangle.Triang(13, 9, 14));}
	@Test public void test33() {assertEquals(1, FindTriangle.Triang(20, 17, 24));}
	@Test public void test34() {assertEquals(1, FindTriangle.Triang(28, 18, 13));}
	@Test public void test35() {assertEquals(4, FindTriangle.Triang(30, 12, 3));}
	@Test public void test36() {assertEquals(1, FindTriangle.Triang(18, 22, 13));}
	@Test public void test37() {assertEquals(2, FindTriangle.Triang(24, 24, 19));}
	@Test public void test38() {assertEquals(4, FindTriangle.Triang(7, 8, 17));}
	@Test public void test39() {assertEquals(4, FindTriangle.Triang(14, 19, 1));}
	@Test public void test40() {assertEquals(1, FindTriangle.Triang(27, 29, 12));}
	@Test public void test41() {assertEquals(1, FindTriangle.Triang(23, 24, 4));}
	@Test public void test42() {assertEquals(3, FindTriangle.Triang(11, 11, 11));}
	@Test public void test43() {assertEquals(1, FindTriangle.Triang(21, 28, 16));}
	@Test public void test44() {assertEquals(1, FindTriangle.Triang(21, 26, 25));}
	@Test public void test45() {assertEquals(4, FindTriangle.Triang(2, 9, 30));}
	@Test public void test46() {assertEquals(1, FindTriangle.Triang(30, 21, 17));}
	@Test public void test47() {assertEquals(1, FindTriangle.Triang(14, 28, 26));}
	@Test public void test48() {assertEquals(1, FindTriangle.Triang(25, 16, 14));}
	@Test public void test49() {assertEquals(3, FindTriangle.Triang(23, 23, 23));}
	@Test public void test50() {assertEquals(1, FindTriangle.Triang(18, 12, 13));}
	@Test public void test51() {assertEquals(4, FindTriangle.Triang(29, 3, 13));}
	@Test public void test52() {assertEquals(1, FindTriangle.Triang(15, 14, 6));}
	@Test public void test53() {assertEquals(4, FindTriangle.Triang(17, 30, 5));}
	@Test public void test54() {assertEquals(1, FindTriangle.Triang(24, 14, 16));}
	@Test public void test55() {assertEquals(4, FindTriangle.Triang(9, 29, 18));}
	@Test public void test56() {assertEquals(3, FindTriangle.Triang(7, 7,7));}
	@Test public void test57() {assertEquals(2, FindTriangle.Triang(16, 17, 16));}
	@Test public void test58() {assertEquals(4, FindTriangle.Triang(16, 27, 10));}
	@Test public void test59() {assertEquals(1, FindTriangle.Triang(10, 20, 12));}
	@Test public void test60() {assertEquals(2, FindTriangle.Triang(14, 4, 14));}
	@Test public void test61() {assertEquals(1, FindTriangle.Triang(13, 12, 11));}
	@Test public void test62() {assertEquals(3, FindTriangle.Triang(9, 9, 9));}
	@Test public void test63() {assertEquals(2, FindTriangle.Triang(12, 23, 12));}
	@Test public void test64() {assertEquals(4, FindTriangle.Triang(1, 14, 10));}
	@Test public void test65() {assertEquals(1, FindTriangle.Triang(20, 18, 5));}
	@Test public void test66() {assertEquals(4, FindTriangle.Triang(10, 8, 28));}
	@Test public void test67() {assertEquals(1, FindTriangle.Triang(14, 22, 26));}
	@Test public void test68() {assertEquals(3, FindTriangle.Triang(14, 14, 14));}
	@Test public void test69() {assertEquals(1, FindTriangle.Triang(28, 9, 29));}


}
