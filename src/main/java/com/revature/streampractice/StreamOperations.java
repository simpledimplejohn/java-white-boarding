package com.revature.streampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// things you can do with a stream
		List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		intList.stream()
			.filter(null) // filters out elements, fewer number
			.map(null) // transforms elements, always same number
			.limit(0) // 
			.distinct(); // ??
		// terminal operators, things that finish a stream
		
		intList.stream()
			.reduce(null); // returns an optional
		intList.stream()
			.collect(null); //can produce a Set, Map or List
		intList.stream()
			.forEach(null); // returns each element 
		
	}

}
