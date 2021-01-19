package com.thinkitive.demo.threading;

public class Demo {

	public static void main(String[] args) {
		Printing p = new Printing();
		MyClass m1 = new MyClass(p);
		MyClass2 m2 = new MyClass2(p);

		m1.setName("TABLE1 ");
		m2.setName("TABLE2 ");

		
		m1.setDaemon(true);
		m2.setPriority(10);
		m1.start();
		m2.start();

	}
}
