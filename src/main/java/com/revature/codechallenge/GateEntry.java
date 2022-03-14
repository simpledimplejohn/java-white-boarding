package com.revature.codechallenge;

import java.util.Arrays;

public class GateEntry {

	public static void main(String[] args) {
		int N = 4;
		int[] firstTest = {2,3,2,0};
		
		System.out.println(gateEntry(N,firstTest));
		
	}

	private static int gateEntry(int N, int[] P) {
		
		int result = -404;
		int count = 0;
		
		boolean done = true;
		while(done) {

			for(int i = 0; i < P.length; i ++) {
				if(P[i] == 0) {
					result = i +1;
					System.out.println("result " + result);
					done = true;
				}	
				P[i] = P[i] - 1;
			
			}

			
			count += 1;
			System.out.println(count);
			System.out.println(Arrays.toString(P));
			done = false;
			
		}
		
		
		return result;
	}

}
