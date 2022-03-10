package com.revature.codechallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColorPen {
	
	/*
	 * You have a stack on N pens numbered from top to bottom, top pen is 1 bottom pen is N
	 * each color is represented by a number in the array A[i] = color number
	 * 
	 * Take the query queries[j] for each pen color
	 * find the highest pen in the stack with the color (pen with min index of that color)
	 * print that possition to the answer[] array
	 * move that pen to the top of the pen color array stack
	 */

	public static void main(String[] args) {
		
		int N = 7;
		int Q = 5;
		int[] A = new int[] {2,1,1,4,3,3,1};
		int[] queries = new int[] {3,2,1,1,4};
		int[] answer = new int[] {5,2,3,1,5};
		
		System.out.println(colorPen(A, queries));

	}

	private static int[] colorPen(int[] A, int[] queries) {
		
		List<Integer> penColor = Arrays.stream(A).boxed().collect(Collectors.toList());
		List<Integer> answerList = new ArrayList<>();
		
		for(int i = 0; i < queries.length; i ++) {
			for(int j = 0; j < penColor.size(); j ++) {
				if(queries[i] == penColor.get(j)) {
					Integer temp = penColor.get(j);
					answerList.add(j+1);
					penColor.remove(j);
					penColor.add(0, temp);
					
					
				}
			}
		}
		
		
		System.out.println(answerList);
		System.out.println(penColor);
		
		
		
		
		
		
		return null;
	}

}
