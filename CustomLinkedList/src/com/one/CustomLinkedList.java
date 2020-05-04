package com.one;

import java.util.NoSuchElementException;

public class CustomLinkedList {
	private Node first;
	private Node last;

	private class Node {
		private int data;
		private Node next;
	
		public Node(Integer value) {
			this.data = value;
		}
	}
	
	public void addLast(Integer input) {
		Node node = new Node(input);
		if(first == null) {
			first = node;
			last  = node;
		}
		else {
			last.next = node;
			last = node;
		}
	}
	
	public void addFirst(Integer input) {
		Node node = new Node(input);
		if(first == null) {
			first = node;
			last  = node;
		}
		else {
			node.next = first;
			first = node;
		}
	}
	//[0->1->2->3->4->5]
	public void deleteFirst() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		// if it has only one element
		if(first == last) {
			first = last = null;
			return;
		}
		Node temp = first.next;
		first.next = null;
		first = temp;
	}
	
	public void deleteLast() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		if(first == last) {
			first = last = null;
			return;
		}
		Node temp = beforeNode(last);
		last = temp;
		last.next = null;
	}
	
	public boolean contains(Integer input) {
		Node temp = first;
		while(temp != null) {
			if(temp.data == input) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public boolean removeFirstOccurrence(Integer i) {
		Node temp = first;
		Node newNode = new Node(i);
		Node beforeNode = beforeNode(newNode);
		if(beforeNode != null) {
			if(beforeNode.next.next == null) {
				last = beforeNode;
				last.next = null;
				return true;
			}
			beforeNode.next = beforeNode.next.next;
			return true;
		}
		return false;
	}
	
	private Node beforeNode(Node node) {
		Node temp = first;
		while(temp != null) {
			if(temp.next.data == node.data) return temp;
			temp = temp.next;
		}
		return null;
	}
	
	private Node afterNode(Node node) {
		Node temp = first;
		while(temp != null) {
			if(temp.data == node.data) return temp.next;
			temp = temp.next;
		}
		return null;
	}
	
	private int getOccurance(Node node){
		int position = 0;
		Node temp = first;
		while(temp != null) {
			if(temp.next.data == node.data) return position;
			temp = temp.next;
			position++ ;
		}
		return -1;
		
	}
}
