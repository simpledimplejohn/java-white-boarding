package com.revature.sorting;


import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] intArray = new int[20];
		
		for (int i = 0; i<intArray.length; i++) {
			intArray[i] = rand.nextInt(10000);
		}
		
		System.out.println(Arrays.toString(intArray));
		
		// Bubble sort here
		
		boolean sorted = true;
		
		while(sorted) {
			sorted = false;
			for(int i = 0; i<intArray.length-1; i++) {
				
				if(intArray[i] > intArray[i+1] ) {
					sorted = true;
					int temp = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = temp;
				}
			}	
		}
		
		
		
		System.out.println(Arrays.toString(intArray));
		

	}

}
