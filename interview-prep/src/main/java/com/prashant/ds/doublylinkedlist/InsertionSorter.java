package com.prashant.ds.doublylinkedlist;

public class InsertionSorter {

	public <T> void sort(DoublyLinkedList<Integer> data) {
		DoublyLinkedNode<Integer> node = data.getHead();
		
		while(node!=null) {
			DoublyLinkedNode<Integer> prev = node.getPrevNode();
			
			while(prev!=null && (prev.getData() > node.getData())) {
				prev = prev.getPrevNode();
			}
			
			DoublyLinkedNode<Integer> next = node.getNextNode();
			if(prev!=null || !data.isHead(node)) {
				node.getPrevNode().setNextNode(next);
				if(next!=null) {
					next.setPrevNode(node.getPrevNode());
				}
				
				node.setPrevNode(prev);
			}
			
			if(prev==null ) {
				if(!data.isHead(node)) {
					node.setNextNode(data.getHead());
					node.getNextNode().setPrevNode(node);
					data.setHead(node);
				}
			} else {
				node.setNextNode(prev.getNextNode());
				prev.getNextNode().setPrevNode(node);
				prev.setNextNode(node);
			}
			
			node = next;
		}
				
	}
}
