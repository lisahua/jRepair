/**
 * @author Lisa Feb 23, 2016 LinkedList.java 
 */
package ece.utexas.edu.repair.examples.nopol;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class LinkedList {

	 Node header = new Node(0);
	 int size=0;
public LinkedList(int[] arr) {
	for (int i: arr) 
		insert(i);
}
	
	public boolean delete(int k) {
		Node prev = null;
		Node lst = header;
		while (lst != null) {
			if (lst.key == k) {
				if (prev != null) {
					prev.next = lst.next;
				} else {
					header = header.next;
				}
				size--;
				return true;
			}
			prev = lst;
			lst = lst.next;
		}
		return false;
	}

	public  void insert(int i) {
		Node node = new Node(i);
		node.next = header;
		header = node;
		size++;
	}

	 class Node {
		Node next;
		int key;

		public Node(int i) {
			key = i;
		}
	}
//
//	public static void main(String[] arg) {
//		Result result = JUnitCore.runClasses(TestLinkedList.class);
//		for (Failure failure : result.getFailures()) {
//			System.out.println(failure.toString());
//		}
//	}
	// public static void main(String[] args) {
	// Random rdn = new Random();
	// for (int i=0;i<40;i++) {
	// int a = rdn.nextInt(70);
	// insert(a);
	// System.out.print(a+",");
	// }
	// System.out.println("\n");
	// for (int i=0;i<40;i++) {
	// int a = rdn.nextInt(70);
	// System.out.println("@Test public void test"+i+"() {
	// assertEquals("+delete(a)+", LinkedList.delete("+a+"));}");
	// }
	// }
}