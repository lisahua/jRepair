package ece.utexas.edu.repair.examples.nopol;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedianExample {

	public int median(int n1, int n2, int n3) {
		if ((n1==n2)|| (n1==n3)||(n2<n1&&n1<n3)|| n3<n1&& n1<n2) return n1;
		if ((n2==n3)|| (n1<n2&& n2<n3)|| (n3<n2&& n2<n1))
			return n2;
		if (n1<n3&& n3<n2)
			return n3;
		return 0;
	}
	@Test
	public void test() {
		assertEquals(6,median(2,6,8));
		assertEquals(6,median(2,8,6));
		assertEquals(6,median(6,2,8));
		assertEquals(6,median(6,8,2));
		assertEquals(6,median(8,2,6));
		assertEquals(6,median(8,6,2));
		assertEquals(9,median(9,9,9));
		assertEquals(6,median(2,6,8));
		assertEquals(6,median(2,6,8));
		
	}
}
