package com.revature.streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Fred", "Bob", "Tom", "Kevin", "Phil", "Carl","Frank" );
		
		List<String> sortedNames = names.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(sortedNames);
		
		
		
	}

}
