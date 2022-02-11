package com.revature.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(5);
		q.add(4);
		q.add(8);
		q.add(12);
		
//		System.out.println(q);

		
		q.forEach((e) -> System.out.println(e));
		for(Integer i : q) {
			System.out.println(i);
		}
		// removes next person from the line (also returns them)
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());		
	}

}
