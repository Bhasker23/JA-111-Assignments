package com.Question1;

public class Bird {

	public void fly() {
		System.out.println("Birds is Flying");
	}
	
}


class Parrot extends Bird{
	
	@Override
	public void fly() {
		System.out.println("I am Flying");
	}
	
	 public void sing() {
		System.out.println("I am singing");
	}
}
