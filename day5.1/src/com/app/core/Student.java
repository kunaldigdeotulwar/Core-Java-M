package com.app.core;

public class Student extends Person {

	private int gradYear;
	private String course;
	private double fees;
	private int marks;

	public Student(String firstName, String lastName, int gradYear, String course, double fees, int marks) {
		super(firstName, lastName);
		System.out.println("In student ctor");
		this.gradYear = gradYear;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student " + super.toString() + " Graduated in " + gradYear + " course " + course + " fees " + fees
				+ " marks " + marks;
	}
	
	//add new behaviour :  study
	
	public void study()
	{
		// displaying student's firstname studying in course name
//		System.out.println(super.getFirstName()+" studying in" + course );
		System.out.println(getFirstName()+" studying in" + course );//getFirstName is public

	}
}
