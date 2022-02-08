package com.revature.threads;

public class SecondThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Second thread " + i);
		}
	}
}
