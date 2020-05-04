package com.one;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(5);
		list.addLast(4);
		list.addLast(6);
		list.addLast(4);
		list.addFirst(0);
	    list.deleteFirst();
		//list.deleteLast();
		list.removeFirstOccurrence(4);
		System.out.println(list.contains(0));
		
		//LinkedList<Integer> a = new LinkedList<Integer>();
		//a.
	}
}