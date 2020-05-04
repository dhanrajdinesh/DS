package com.one;

public class Demo {

	public static void main(String[] args) {
		ArrayListCustom<Integer> alc = new ArrayListCustom<Integer>();
		alc.add(0);
		alc.add(1);
		alc.add(2);
		alc.add(3);
		alc.add(4);
		alc.add(5);
		alc.add(6);
		alc.add(7);
        alc.print();
         //System.out.println(alc.get(8));
         //System.out.println(alc.length());
        System.out.println("index : " + alc.indexOf(2));
        Object[] arr =  alc.toArray();
        
	}

}
