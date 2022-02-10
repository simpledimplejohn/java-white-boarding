package com.revature.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
	
/*
 *  -Take array and divide in half
 *  -merge sort recursivily
 *  -split in half
 * 	-merge sort each half
 * 	-until you have one element array
 * 	NOW MERGE
 * 	-merge single element to two element arrays in order
 * 	-compare first element of each array
 *  -compare and merge second element
 *  -continue
 */

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=bOk35XmHPKs
		Random rand = new Random();
		int[] intArray = new int[11];
		for(int i = 0; i < intArray.length; i ++) {
			intArray[i] = rand.nextInt(1000);
		}
		System.out.println(Arrays.toString(intArray));
		
		mergeSort(intArray);
		
		System.out.println(Arrays.toString(intArray));
		

	}
	private static int count = 1;
	private static void mergeSort(int[] inputArray) {
//		System.out.println("Sort Count: "+count ++);
		// create varaible for length
		int inputLength = inputArray.length;
		// base case, once one element we are done with sorting--now merging
		if(inputLength < 2) {
			return;
		}
		// divide array in two, take half the length
		int midIndex = inputLength/2;
//		System.out.println("right side: " + midIndex);
		int[] leftHalf = new int[midIndex];
		// acount for odd numbers:
//		System.out.println("left side: "+ (inputLength - midIndex));
		int[] rightHalf = new int[inputLength - midIndex];
		
		// fill up left half array
		for(int i = 0; i < leftHalf.length; i ++) {
			leftHalf[i] = inputArray[i];
		}
		// fill up right half array
		// start at 
		for(int j = 0; j<rightHalf.length; j++) {
//			System.out.println("index= "+j);
			rightHalf[j] = inputArray[j+midIndex];
		}
//		System.out.println("Left half");
//		System.out.println(Arrays.toString(leftHalf));
//		System.out.println("Right half");
//		System.out.println(Arrays.toString(rightHalf));
		
		// Now recursivly run arrays
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		// now merge with the merge method bellow: 
		merging(inputArray, leftHalf, rightHalf);
		
	}
	// takes in the original input array, the right and left arrays
	public static void merging(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftLength = leftHalf.length;
		int rightLength = rightHalf.length;
		int i = 0; // left half iterator
		int j = 0; // right half iterator
		int k = 0; //  merged iterator
		
		// looping until all iterations are full, basically a broken out
		// for loop so that we don't need to put evertying in the loop statment
		while(i<leftLength && j < rightLength) {
			// just sorting the leftHalf array
			if(leftHalf[i] <= rightHalf[j]) {
				// then add the lowest element first
				inputArray[k] = leftHalf[i];
				i ++; // now look at the next element of the leftHalf
			}
			else { // now we know that rightHalf[i] is smaller so add that
				inputArray[k] = rightHalf[j];
				j ++;
			}
			k ++;
		}
///////////////STILL CONFUSED/////////////////////////////
		// still have left over array elements
		// checking extras in the left
		while(i<leftLength) {
//			System.out.println("left over values = " + leftHalf[i]);
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		while(j<rightLength) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}
	}
}
