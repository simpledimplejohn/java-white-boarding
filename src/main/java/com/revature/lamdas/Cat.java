package com.revature.lamdas;



public class Cat implements Printable {
	private String name;
	public Cat(String name) {
		this.name = name;
	}
	@Override
	public void print() {
		System.out.println("meow");
		
	}
	

	

}
