package com.revature.threadloop;

public class TheThread implements Runnable {
	
	private int name;
	public TheThread(int name) {
		this.name = name;
	}

	public void run() {
		for(int i = 0; i <=5; i++) {
			System.out.println(i + " from thread " + name);
		}
		
	}

}
