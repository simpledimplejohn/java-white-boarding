package com.revature.codechallenge;

import java.util.Arrays;

public class SortArrDigits {

	public static void main(String[] args) {
		
		/*
		 * Sort array by digits
		 * if digits are the same number, keep order the same
		 */
		int[] inputArr = new int[]{98,28,21,12,13};
		
		int[] secArr = new int[] {9,10,122,8,1290};
		
		System.out.println(Arrays.toString(sortArr(inputArr)));
		System.out.println(Arrays.toString(sortArr(secArr)));
		
		
		
	}

	private static String[] sortArr(int[] intArr) {
		// TODO Auto-generated method stub
		boolean sorted = true;
		
		String[] stringArr = new String[intArr.length];
		
		for(int i = 0; i < intArr.length; i ++) {
			stringArr[i] = Integer.toString(intArr[i]);
		}
		

		
		while(sorted) {
			sorted = false;
			for(int i = 0; i <intArr.length-1; i++) {
				if(stringArr[i].length() > stringArr[i+1].length()) {
					sorted = true;
					String temp = stringArr[i];
					stringArr[i] = stringArr[i+1];
					stringArr[i+1] = temp;
					
				}
			}
			
			
		}
		
		return stringArr;
	}

}
