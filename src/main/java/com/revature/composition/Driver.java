package com.revature.composition;

/*
 * Composition is an object inheriting the properties of another object
 * By passing that object into the constructor
 * 
 */

public class Driver {

	public static void main(String[] args) {
		Human john = new Human("John");
		Dog fred = new Dog("fred", john);
		
		// fred the dog can now print out john's name
		System.out.println(fred);
		


	}

}
