package com.revature.composition;

public class Human {
	private String name;
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void callDog(String name) {
		System.out.println("Hey! " + name);
	}
}
