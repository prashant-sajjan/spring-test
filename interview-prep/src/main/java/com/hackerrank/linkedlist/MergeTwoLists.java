package com.hackerrank.linkedlist;

public class MergeTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode currA = head1;
        SinglyLinkedListNode currB = head2;
    
        while (currA != currB) {
            if (currA.next == null) {
                currA = head2;
            } else {
                currA = currA.next;
            }
            
            if (currB.next == null) {
                currB = head1;
            } else {
                currB = currB.next;
            }
        }
        return currA.data;

    }
}
