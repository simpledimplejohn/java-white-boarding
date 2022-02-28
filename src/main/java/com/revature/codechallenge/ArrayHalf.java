package com.revature.codechallenge;

public class ArrayHalf {

	public static void main(String[] args) {
		
		// find the middle of a sorted array
		// both odd and even
		
		int[] arrOdd = new int[] {5,6,8,9,10};
		int[] arrEven = new int[] {3,4,5,6};
		
		System.out.println("should be 8 " + midArr(arrOdd));
		System.out.println("should be 4 " + midArr(arrEven));
 		
		
 
	}

	private static int midArr(int[] arr) {
		int middle = 0;
		
		double length = arr.length;
//		System.out.println("length = " + length);
		double half = length/2;
//		System.out.println("half " + half);
		
		if(length %2 != 0) {
			int i = (int) Math.ceil(half);
//			System.out.println("i " + i);
			return arr[i - 1];
		} else {
			int upper = arr[(int) half];
			int lower = arr[(int) (half - 1)];
			return (upper + lower)/2;
		}
		
		
//		System.out.println(half);

	}

}
