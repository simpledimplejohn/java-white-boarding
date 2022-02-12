package com.revature.collections;

import java.util.stream.IntStream;

public class Streams {

	public static void main(String[] args) {
		
		
		
		
// makes 10000 random numbers		
		IntStream.generate(() -> { return (int)(Math.random() * 10000);})
			.limit(10)
//			.of(1,2,3,5,8,90)
//			.range(1, 10)
//			.skip(5)
//			.sum();
			.forEach((e) -> System.out.println(e));
		System.out.println();
		

	}

}
