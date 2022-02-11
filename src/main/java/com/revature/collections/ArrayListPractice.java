package com.revature.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
	public static void main(String[] args) {
		List<String> newArrayList = new ArrayList<>(Arrays.asList("john","bob","fred","geroge","tom"));
//		System.out.println(newArrayList);
		
		newArrayList.forEach((e) -> System.out.println(e));
		
	}
}
