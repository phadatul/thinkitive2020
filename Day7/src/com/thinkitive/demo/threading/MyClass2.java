package com.thinkitive.demo.threading;

public class MyClass2 extends Thread {
	
	Printing p;
	public MyClass2(Printing  p) {
		this.p=p;
	}
	@Override
	public void run() {
		p.printTable(9);
	}

}
