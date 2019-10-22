package com.prashant.ds.doublylinkedlist;

public class DoublyLinkedNode<T> {

	private T data;
	private DoublyLinkedNode<T> nextNode;
	private DoublyLinkedNode<T> prevNode;
	
	public DoublyLinkedNode(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public DoublyLinkedNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoublyLinkedNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	public DoublyLinkedNode<T> getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(DoublyLinkedNode<T> prevNode) {
		this.prevNode = prevNode;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
}
