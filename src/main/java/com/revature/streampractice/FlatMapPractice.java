package com.revature.streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapPractice {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		
		List<List<Integer>> listList = Arrays.asList(list1,list2,list3);
		
		List<Integer> flatList = listList.stream()
				.flatMap(l->l.stream())
				.collect(Collectors.toList());
		System.out.println(listList);
		System.out.println(flatList);
		
		
	}

}
