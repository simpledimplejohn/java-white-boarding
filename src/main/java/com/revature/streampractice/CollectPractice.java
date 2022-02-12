package com.revature.streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectPractice {

	public static void main(String[] args) {
		List<Character> charList = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g');
		
		List<Character> reducedChar = charList.stream()
				.filter(c-> c > 'd')
				.collect(Collectors.toList());
		System.out.println(reducedChar);
		
		
		
	}

}
