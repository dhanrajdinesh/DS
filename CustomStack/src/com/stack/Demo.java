package com.stack;

public class Demo {
	public static void main(String ar[]) {

		CustomStack cs = new CustomStack(4);
		cs.push(1);
		cs.push(2);
		cs.push(3);
		cs.push(4);
		cs.pop();
		cs.push(5);
		cs.display();
		System.out.println("removed item : " + cs.pop());
		System.out.println("----------");
		System.out.println("Top element : " + cs.peek());
		cs.display();
	}

}
