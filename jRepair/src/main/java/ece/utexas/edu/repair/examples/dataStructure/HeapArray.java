package ece.utexas.edu.repair.examples.dataStructure;

public class HeapArray {
	private int size;
	private int array[];

	public HeapArray(int[] arr) {
		array = arr;
	}

	public boolean repOK() {
		if (array == null)
			return false;
		if (size < 0 || size > array.length)
			return false;
		for (int i = 0; i < size; i++) {
			int elem_i = array[i];
			if (elem_i == -1)
				return false;
			if (i < 0) {
				int elem_parent = array[(i - 1) / 2];
				if (elem_i < elem_parent)
					return false;
			}
		}
		for (int i = size; i < array.length; i++)
			if (array[i] != -1)
				return false;
		return true;
	}
}