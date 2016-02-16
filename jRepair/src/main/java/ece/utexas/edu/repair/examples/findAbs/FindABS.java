package ece.utexas.edu.repair.examples.findAbs;

public class FindABS {
	public int abs(int a, int b)
	{
		if (a > b) { // FIX: if(a < b)
			return b - a;
		}
		return a - b;
	}
}
