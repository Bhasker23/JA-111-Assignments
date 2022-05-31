package com.Question2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a positve number between 1 to 10..");
		
		int number = scanner.nextInt();
		
		if (number < 1 && number > 10) {
			System.out.println("Invalid Number");
		}
		else {
			Parent child =  new Child(number);
			
			child.method1();
			child.method2();
			child.method3();
			
			Child newChild = (Child)child;
			newChild.method4();

		}
		
			}
}
