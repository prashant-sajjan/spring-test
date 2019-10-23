package com.hackerrank.linkedlist;

public class InsertNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		
        SinglyLinkedListNode n=new SinglyLinkedListNode(data);

        SinglyLinkedListNode node=head;
        while(position!=1 && node.next!=null)
        {
            node=node.next;
            position--;
        }
        SinglyLinkedListNode temp=node.next;
        node.next=n;
        n.next=temp;
        return head;

    }
	
	
	     
}
