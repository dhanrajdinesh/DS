package com.stack;

public class CustomStack {

	private int[] array;
	private int top = -1;
	private int capacity;

	public CustomStack(int size) {
		this.capacity = size;
		this.array = new int[size];
	}

	public void push(int item) {
		if (!isFull()) {
			array[++top] = item;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	private boolean isFull() {
		return top == capacity - 1;
	}

	private boolean isEmpty() {
		return top == -1;
	}

	public int pop() {
		if (!isEmpty()) {
			return array[top--];
		} else {
			return -1;
		}
	}

	public int peek() {
		return array[top];
	}

	public int size() {
		return top + 1;
	}

	public void display() {
		for (int i = top; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}
