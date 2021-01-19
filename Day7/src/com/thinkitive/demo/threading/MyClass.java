package com.thinkitive.demo.threading;

public class MyClass extends Thread {
	Printing p;
	public MyClass(Printing  p) {
		this.p=p;
	}

	@Override
	public void run() {

		p.printTable(11);
	}

}
