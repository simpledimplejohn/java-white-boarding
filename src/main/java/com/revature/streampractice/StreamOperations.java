package com.revature.streampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// things you can do with a stream
		List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		intList.stream()
			.filter(i -> i <5) // filters out elements, fewer number
			.map(i -> i.toString()) // transforms elements, always same number
			.limit(4)
			.forEach(i -> System.out.println(i));// 
//			.distinct(); // ??
		// terminal operators, things that finish a stream
		
		intList.stream()
			.reduce(null); // returns an optional
		intList.stream()
			.collect(Collectors.toSet());//can produce a Set, Map or List
		
		System.out.println("forEach");
		intList.stream()
			.forEach(e->System.out.println("element: "+e)); // returns each element 
		
		
		
	}

}
