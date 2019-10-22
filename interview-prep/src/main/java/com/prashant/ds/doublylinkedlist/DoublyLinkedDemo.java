package com.prashant.ds.doublylinkedlist;

public class DoublyLinkedDemo {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> integers = new DoublyLinkedList<>();

		integers.insertAtHead(5);
		integers.insertAtHead(10);
		integers.insertAtHead(2);
		integers.insertAtHead(12);
		integers.insertAtHead(19);
		integers.insertAtHead(20);
		new InsertionSorter().sort(integers);
		System.out.println(integers);

	}
}
