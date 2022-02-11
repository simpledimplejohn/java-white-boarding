package com.revature.collections;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
	public static void main(String[] args) {
		// can't have duplicates
		Set<Integer> newSet = new HashSet<>();
		
		newSet.add(1);
		newSet.add(4);
		newSet.add(5);
		newSet.add(7);
		newSet.add(1);
		newSet.add(9);
		
		System.out.println(newSet);
		
		for(Integer i : newSet) {
			System.out.println(i);
		}
		newSet.forEach((e) -> System.out.println(e));
		
	}
}
