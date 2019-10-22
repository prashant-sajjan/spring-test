package com.prashant.ds.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> integers = new LinkedList<Integer>();
		integers.addAtStart(5);
		integers.addAtStart(10);
		integers.addAtStart(2);
		integers.addAtStart(12);
		integers.addAtStart(19);
		integers.addAtStart(20);
		System.out.println(integers.length());
		System.out.println(integers.find(120));
		integers.deleteFromStart();
		System.out.println(integers.length());
	}

}
