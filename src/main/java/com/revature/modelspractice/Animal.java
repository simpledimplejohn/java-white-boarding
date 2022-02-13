package com.revature.modelspractice;

import java.util.Objects;

public class Animal {
	private String name;
	private int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// add getters setters equals
	
	public String getName() {
		return this.name;
	}
	public void setName(String value) {
		this.name = value;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}
