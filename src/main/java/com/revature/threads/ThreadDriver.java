package com.revature.threads;

public class ThreadDriver {

	public static void main(String[] args) {
		
		SecondThread t2 = new SecondThread();
		
		FirstThread t1 = new FirstThread();
		Thread newThread = new Thread(t1);
		
		t2.start();
		
		newThread.start();
		
		
//		f1.run();

	}

}
