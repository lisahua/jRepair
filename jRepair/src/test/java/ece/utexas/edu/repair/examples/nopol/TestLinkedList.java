/**
 * @author Lisa Feb 23, 2016 Testlist.java 
 */
package ece.utexas.edu.repair.examples.nopol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinkedList {
	int[] arr = { 9,43,41,5,4,9,21,2,16,55,19,55,27,23,41,14,22,33,61,49,68,65,9,18,32,11,5,69,53,39,55,51,51,39,37,65,30,3,33,48,0 };
	int[] arr2 = { 5,43,21,2,16,55,19,55,27,23,41,14,22,32,61,49,68,65,95,69,53,39,55,51,51,39,37,65,30,3,33,48,0 };
	int[] arr3 = { 14,22,3,61,49,68,65,95,69,53,39,55,51,51,39,48,0 };
	
	
	LinkedList list = new LinkedList(arr);
	LinkedList list2 = new LinkedList(arr2);
	LinkedList list3 = new LinkedList(arr3);
	@Test public void test25() {assertEquals(true, list.delete(9));}
	@Test public void test50() { assertEquals(true, list2.delete(43));}
	@Test public void test51() { assertEquals(true, list.delete(5));}
	@Test public void test0() { assertEquals(false, list2.delete(8));}
	@Test public void test1() { assertEquals(false, list.delete(31));}
	@Test public void test2() { assertEquals(false, list2.delete(12));}
	@Test public void test3() { assertEquals(false, list.delete(36));}
	@Test public void test4() { assertEquals(true, list2.delete(32));}
	@Test public void test5() { assertEquals(true, list2.delete(16));}
	@Test public void test6() { assertEquals(false, list.delete(25));}
	@Test public void test7() { assertEquals(false, list.delete(10));}
	@Test public void test8() { assertEquals(true, list2.delete(16));}
	@Test public void test9() { assertEquals(true, list3.delete(3));}
	@Test public void test10() { assertEquals(true, list.delete(23));}
	@Test public void test11() { assertEquals(false, list3.delete(5));}
	@Test public void test12() { assertEquals(true, list.delete(27));}
	@Test public void test13() { assertEquals(false, list.delete(26));}
	@Test public void test14() { assertEquals(true, list.delete(48));}
	@Test public void test15() { assertEquals(false, list.delete(20));}
	@Test public void test16() { assertEquals(false, list.delete(7));}
	@Test public void test17() { assertEquals(false, list3.delete(13));}
	@Test public void test18() { assertEquals(false, list2.delete(62));}
	@Test public void test19() { assertEquals(false, list.delete(44));}
	@Test public void test20() { assertEquals(false, list.delete(15));}
	@Test public void test21() { assertEquals(true, list.delete(19));}
	@Test public void test22() { assertEquals(true, list.delete(49));}
	@Test public void test23() { assertEquals(false, list.delete(10));}
	@Test public void test24() { assertEquals(false, list2.delete(6));}
	@Test public void test26() { assertEquals(true, list.delete(39));}
	@Test public void test28() { assertEquals(true, list.delete(33));}
	@Test public void test29() { assertEquals(false, list3.delete(67));}
	@Test public void test30() { assertEquals(false, list2.delete(12));}
	@Test public void test31() { assertEquals(true, list.delete(32));}
	@Test public void test32() { assertEquals(false, list.delete(10));}
	@Test public void test33() { assertEquals(true, list.delete(30));}
	@Test public void test34() { assertEquals(false, list3.delete(24));}
	@Test public void test35() { assertEquals(false, list.delete(66));}
	@Test public void test37() { assertEquals(true, list.delete(33));}
	@Test public void test38() { assertEquals(false, list2.delete(17));}
	@Test public void test39() { assertEquals(true, list.delete(4));}


}
