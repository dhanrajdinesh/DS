package com.one;

public class Demo {

	public static void main(String ar[]) {
		
		CustomQueue q = new CustomQueue();
		q.enQ(1);
		q.enQ(2);
		q.enQ(3);
		q.enQ(4);
		q.enQ(5);
		q.display();
		q.deQ();
		q.enQ(6);
		//q.deQ();
		q.display();
		
	}
}
