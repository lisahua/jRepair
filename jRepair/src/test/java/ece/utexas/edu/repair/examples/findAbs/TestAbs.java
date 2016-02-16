package ece.utexas.edu.repair.examples.findAbs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ece.utexas.edu.repair.examples.findAbs.FindABS;

public class TestAbs {

	@Test
	public void test1()
	{
		FindABS program = new FindABS();
		assertEquals(program.abs(3, 5), 2);
	}
	
	@Test
	public void test2()
	{
		FindABS program = new FindABS();
		assertEquals(program.abs(5, 3), 2);
	}
	
	@Test
	public void test3()
	{
		FindABS program = new FindABS();
		assertEquals(program.abs(4, 0), 4);
	}
	
	@Test
	public void test4()
	{
		FindABS program = new FindABS();
		assertEquals(program.abs(0, 4), 4);
	}
	
	@Test
	public void test5()
	{
		FindABS program = new FindABS();
		assertEquals(program.abs(1, 1), 0);
	}
	
	@Test
	public void test6()
	{
		FindABS program = new FindABS();
		assertEquals(program.abs(0, -3), 3);
	}
	
}
