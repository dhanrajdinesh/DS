package com.one;

public class ArrayListCustom<E> implements ListCustom<E> {

	private int size = 0;
	private Object elements[];

	public ArrayListCustom() {
		elements = new Object[4];
	}

	@Override
	public void add(E v) {
		if (size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = v;

	}

	private void ensureCapacity() {
		int newSize = elements.length + elements.length / 2;
		Object newArray[] = new Object[newSize];
		for (int i = 0; i < elements.length; i++) {
			newArray[i] = elements[i];
		}
		elements = newArray;
	}

	@Override
	public E get(int index) {
		if (index < 0 || size <= index)
			throw new ArrayIndexOutOfBoundsException();
		return (E) elements[index];
	}

	@Override
	public void remove(int index) {
		if (index < 0 || size <= index)
			throw new ArrayIndexOutOfBoundsException();
		for (int i = index; i <= size; i++) {
			elements[i] = elements[i + 1];
		}
		size = size - 1;
	}

	@Override
	public int indexOf(E val) {
		int res = -1;
		for (int i = 0; i < size; i++) {
			if (val.equals(elements[i])) {
				res = i;
			}
		}
		return res;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void print() {
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			if (i < size - 1)
				System.out.print(elements[i] + ",");
			if (i == size - 1)
				System.out.print(elements[i]);
		}
		System.out.print("]");
		System.out.println();
	}

	@Override
	public E[] toArray() {
		Object[] res = new Object[size];
		for (int i = 0; i < size; i++) {
			res[i] = elements[i];
		}
		return (E[]) res;
	}
}
