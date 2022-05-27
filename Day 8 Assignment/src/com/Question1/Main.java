package com.Question1;

public class Main {

	public static void main(String[] args) {
		
		Bird b1 = new Parrot();
		b1.fly();
		
		
		Parrot p1 = (Parrot)b1;
		
		p1.sing();
	
//	If you want to call any method from child class by parent class reference 
//	variable then it gives you an error and if you create one more child class 
//	object in main then in java objects are costly so we should do down casting of 
//	child class to parent class variable and from that variable you can access child class methods also.
		
		
	}
}
