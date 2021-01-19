package com.thinkitive.demo.threading;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+" :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
