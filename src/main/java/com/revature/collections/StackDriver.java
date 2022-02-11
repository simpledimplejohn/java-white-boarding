package com.revature.collections;

import java.util.Stack;

public class StackDriver {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.add(1);
		s.add(5);
		s.add(9);
		s.add(3);
		
//		for(Integer i : s) {
//			System.out.println(i);
//		}
		s.forEach((e) -> System.out.println(e));
		
//		System.out.println(s);
//	
//		System.out.println(s.capacity()); //??
//		System.out.println(s.peek());
//		
//		// get top item
//		System.out.println(s.pop());
//		System.out.println(s);
//		
//		// gets by index
//		System.out.println(s.get(0));
	}

}
