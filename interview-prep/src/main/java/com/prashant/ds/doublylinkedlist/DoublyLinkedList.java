package com.prashant.ds.doublylinkedlist;

public class DoublyLinkedList<T> {

	private DoublyLinkedNode<T> head;
	
	public DoublyLinkedNode<T> getHead() {
		return head;
	}
	public void setHead(DoublyLinkedNode<T> head) {
		this.head = head;
	}

	public void insertAtHead(T data) {
		DoublyLinkedNode<T> newNode = new DoublyLinkedNode<T>(data);
		newNode.setNextNode(this.head);
		if(this.head!=null) {
			this.head.setPrevNode(newNode);
		}
		this.head = newNode;
	}
	
	public DoublyLinkedNode<T> removeFromStart() {
		DoublyLinkedNode<T> nodeToDel = this.head;
		this.head = this.head.getNextNode();
		return nodeToDel;
	}
	
	public int length() {
		if(this.head == null) {
			return 0;
		}
		
		DoublyLinkedNode<T> curr = this.head;
		int length = 0;
		
		while(curr!=null) {
			length++;
			curr = curr.getNextNode();
		}
		return length;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public boolean isHead(DoublyLinkedNode<T> node) {
		return this.head.equals(node);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DoublyLinkedNode n = this.head;
		while (n != null) {
			sb.append("Node data: ");
			sb.append(n);
			sb.append("\n");
			n = n.getNextNode();
		}
		return sb.toString();
	}
}
