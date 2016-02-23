/**
 * @author Lisa Feb 22, 2016 TestIncrease.java 
 */
package ece.utexas.edu.repair.examples.nopol;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIncrease {
	@Test
	public void test1() {
		assertEquals(0, new FindIncrease().increase(-1));
	}
@Test
	public void test2() {
		assertEquals(1, new FindIncrease().increase(0));

	}
@Test
public void test3() {
	assertEquals(2, new FindIncrease().increase(1));
}
@Test
public void test4() {
	assertEquals(3, new FindIncrease().increase(2));

}
@Test
public void test5() {
	assertEquals(-1, new FindIncrease().increase(-2));
}

}
