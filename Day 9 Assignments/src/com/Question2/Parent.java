package com.Question2;



public class Parent {

	public void method1() {
		System.out.println("Inside method1 of Parent");
	}
	final public void method2() {
		System.out.println("Inside Method2 of Parent");
	}
	public void method3() {
		System.out.println("Inside Method3 of Parent");
	}
	
	final int number;
	

	
	public Parent(int number) {
		
			this.number = number;
		
		
	}
	
}


final class Child extends Parent{
	
	@Override
	public void method1() {
		System.out.println("Inside method1 of Child, Number is   " + number);
	}
	
	public void method4() {
		System.out.println("Inside method4 of Child");
	}
	
	public Child(int number) {
		
		
			super(number);
		
		
		
	}

}



