package com.revature.composition;

public class Dog {
	
	private String name;
	// reference to the human
	// every dog belongs to a human
	private Human owner;
	
	public Dog(String name, Human owner) {
		this.name = name;
		this.owner = owner;
	}
	
	public String toString() {
		return "Dog name: " + name+" Owned By "+ owner.getName();
	}
}
