package com.one;

public class CustomQueue {

	private int size = 5;
	private int total;
	private int front = 0;
	private int rear = 0;
	private int[] queue = new int[size];

	public void enQ(int input) {
		if (isFull()) {
			throw new IndexOutOfBoundsException();
		}

		queue[front] = input;
		front = (front + 1) % size;
		total++;
	}

	public void deQ() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		System.out.println("successfully removed : " + queue[rear]);
		queue[rear] = 0;
		rear = (rear + 1) % size;
		total--;
	}

	private boolean isFull() {
		return total == size;
	}

	public boolean isEmpty() {
		return total == 0;
	}

	public void display() {
		int r = rear;
		if (total != 0) {
			for (int i = 0; i < total; i++) {
				System.out.println(queue[r]);
				r = (r + 1) % size;
			}
		}
	}
}
