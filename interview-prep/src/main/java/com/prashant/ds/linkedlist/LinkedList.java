package com.prashant.ds.linkedlist;

public class LinkedList<T> {

	private Node<T> head;

	public Node<T> getHead() {
		return head;
	}
	
	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	public void addAtStart(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	
	public Node<T> deleteFromStart() {
		Node<T> nodeToDel = this.head;
		this.head = this.head.getNextNode();
		return nodeToDel;
	}
	
	public Node<T> find(T data) {
		Node<T> curr = this.head;
		while(curr != null) {
			if(curr.getData().equals(data)) {
				return curr;
			}
			curr = curr.getNextNode();
		}
		
		return null;
	}
	
	public int length() {
		if(this.head == null) {
			return 0;
		}
		Node<T> curr = this.head;
		int length = 0;
		
		while(curr != null) {
			length++;
			curr = curr.getNextNode();
		}
		
		return length;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	

	@Override
	public String toString() {
		String res = "";
		Node<T> curr = this.head;
		while (curr != null) {
			res += curr + ", ";
			curr = curr.getNextNode();
		}
		return res;
	}

}
