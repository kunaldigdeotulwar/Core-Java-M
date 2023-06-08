package com.app.core;

public class Faculty extends Person {
	private int yrsOfExperiance;
	private String sme;

	public Faculty(String fn, String ln, int yrs, String sme) {
		super(fn, ln);
		System.out.println("In faculty ctor");
		yrsOfExperiance = yrs;
		this.sme = sme;
	}

	@Override
	public String toString() {

		return "Faculty" + super.toString() + "teaching for" + yrsOfExperiance + "expert in" + sme;
	}
	
	public void teach()
	{
		System.out.println(getFirstName()+" expert in " + sme);
	}

}
