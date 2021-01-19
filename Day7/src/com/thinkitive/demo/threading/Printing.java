package com.thinkitive.demo.threading;

public class Printing {
	public synchronized void printTable(int num) {

		for (int i = 1; i <= 10; i++) {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + " :" + (num * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
