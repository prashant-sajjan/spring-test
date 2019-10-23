package com.hackerrank.linkedlist;

public class DetectCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Node {
        int data;
        Node next;
    }

	boolean hasCycle(Node head) {
	    Node slow = head;
	    Node fast = head;

	    while(fast != null && fast.next != null) {
	        slow = slow.next;          // 1 hop
	        fast = fast.next.next;     // 2 hops 

	        if(slow == fast)  // fast caught up to slow, so there is a loop
	            return true;
	    }
	    return false;  // fast reached null, so the list terminates
	}
}
