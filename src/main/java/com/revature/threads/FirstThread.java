package com.revature.threads;

public class FirstThread implements Runnable {

	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("first thread " + i);
		}
	}
	
}
