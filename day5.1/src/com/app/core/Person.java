package com.app.core;

public class Person {
	private String firstName,lastName;

	public Person(String firstName, String lastName) {
		
		//super();
		System.out.println("In person ctor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	

//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}

	public String toString() {
		return " " + firstName + " " + lastName;
	}
	//add getter for firstname
//	public String getFirstName() {
//		return this.firstName;
//	}
//	public Person() {};
}
