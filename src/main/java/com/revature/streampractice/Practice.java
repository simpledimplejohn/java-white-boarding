package com.revature.streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Bob", "Kevin", "Jack", "Fred", "Mark", "Doug", "Arron", "George");
		
		
//		List<String> lowerName = nameList.stream()
//			.map(n->n.toLowerCase())
//			.collect(Collectors.toList() );
//		System.out.println(nameList);
//		System.out.println(lowerName);
		
		nameList.stream()
			.filter(s -> s.contains("a"))
			.forEach(s-> System.out.println(s));
		
	}

}
