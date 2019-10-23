package com.prashant.ds.doublylinkedlist;

public class ReverseDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
		if (head == null){
            return null;
        }
		
        while(head != null){
            DoublyLinkedListNode i = head.prev;
            head.prev = head.next;
            head.next = i;
            if (head.prev == null){
                return head;
            }
            head = head.prev;
        }
        return head;
    }
}
