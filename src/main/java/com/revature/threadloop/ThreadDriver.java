package com.revature.threadloop;

public class ThreadDriver {

	public static void main(String[] args) {
		for(int i = 0; i <= 4; i++) {
			TheThread t = new TheThread(i);
			Thread newT = new Thread(t);
			newT.start();
		}

	}

}
