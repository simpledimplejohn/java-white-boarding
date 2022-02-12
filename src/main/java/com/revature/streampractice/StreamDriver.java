package com.revature.streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// introduced in Java 8
// process collections
// what's the difference between a stream and a collection
// sequence of object refrences that can be pipelined to produce results
// without changing the underlying data source
// collections arrays IO channels like a bite stream

public class StreamDriver {
	public static void main(String[] args) {
		List<String> bingoNums = Arrays.asList("B10", "O12", "d30", "G53", "G47", "g15", "I12", "I09");
// sort the stream and print		
		bingoNums.stream()
			.map(n -> n.toUpperCase()) //
			.filter(n -> n.startsWith("G"))
			.sorted() // sorts the output
			.forEach(System.out::println);
// now do this but put it into a new dataset
		List<String> gNums = bingoNums.stream()
			.map(n -> n.toUpperCase()) //
			.filter(n -> n.startsWith("G"))
			.sorted() // sorts the output
			.collect(Collectors.toList());
		System.out.println(gNums);
		System.out.println(bingoNums);
		
		// create a stream and save to an optional of the first A num
		// if A num does not exist it will return as null
		Optional<String> aNum = bingoNums.stream()
				.map(String::toUpperCase)
				.filter(n-> n.startsWith("A"))
				.findFirst();
		System.out.println("A's "+aNum);
			

	}
}
