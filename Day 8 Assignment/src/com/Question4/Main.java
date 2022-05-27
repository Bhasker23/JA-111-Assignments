package com.Question4;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Tiger();
		
		System.out.println("Dog all Methods");
		
		System.out.println("-----------------");
		
		animals[0].eat();
		animals[0].makeNoise();
		animals[0].walk();
		
		System.out.println("--------------------");
		System.out.println();
		
		System.out.println("Cat all Methods..");
		
		System.out.println("---------------------");
		animals[1].eat();
		animals[1].makeNoise();
		animals[1].walk();
		
		System.out.println("---------------------");
		System.out.println();
		
		
		System.out.println("Tiger all Methods..");
		
		System.out.println("---------------------");
		
		animals[2].eat();
		animals[2].makeNoise();
		animals[2].walk();
		
		System.out.println("--------------------");
		
	}
}
