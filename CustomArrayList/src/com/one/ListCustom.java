package com.one;

public interface ListCustom<E> {

	public void add(E t);
	
	public E get(int index);
	
	public void remove(int index);
	
	public int indexOf(E val);
	
	public int length();
	
	public void print();
	
	public E[] toArray(); 
	
}
