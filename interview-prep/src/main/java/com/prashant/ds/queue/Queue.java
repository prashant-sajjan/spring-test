package com.prashant.ds.queue;

public class Queue {

	private int[] items = new int[5];
	private int head = -1;
	private int tail = -1;
	private int noOfItems = 0;
	
	private Queue() {
		
	}
	
	private Queue(int size) {
		this.items = new int[size];
	}
	
	public boolean isFull() {
		return noOfItems == items.length;
	}
	
	public boolean isEmpty() {
		return noOfItems == 0; 
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			throw new RuntimeException("Queue is full");
		}
		
		if(tail==items.length-1) {
			tail = -1;
		}
		
		items[++tail] = item;
		noOfItems++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		
		if(head==items.length-1) {
			head = -1;
		}
		noOfItems--;
		return items[++head];
	}
	
	public int peek() {
		return items[head+1];
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println(q.isEmpty());
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(10);
		q.enqueue(46);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);
		q.enqueue(10);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}
