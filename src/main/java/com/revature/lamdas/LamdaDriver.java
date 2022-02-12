package com.revature.lamdas;

public class LamdaDriver {

	public static void main(String[] args) {
		// for interfaces, to implement the the method
		Cat newCat = new Cat("Pismo");
		printThing(newCat);
		
		

	}
	
	static void printThing(Printable thing) {
		thing.print();
	}

}
