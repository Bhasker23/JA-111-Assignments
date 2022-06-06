package com.Question3;

import java.util.Scanner;

public class Demo {
	
	public void showDetails(Month m){
		
		if (m == Month.JAN) {
			System.out.println("This is the First month of Year - January");
		}
		if (m == Month.FEB) {
			System.out.println("This is the secound month of Year - Februray");
		}
		if (m == Month.MARCH) {
			System.out.println("This is the third month of Year - March");
		}
		if (m == Month.APRIL) {
			System.out.println("This is the Forth month of Year - April");
		}
		if (m == Month.MAY) {
			System.out.println("This is the Fifth month of Year - May");
		}
		if (m == Month.JUN) {
			System.out.println("This is the Sixth month of Year - june");
		}
		if (m == Month.JULY) {
			System.out.println("This is the Seventh month of Year - July");
		}
		if (m == Month.AUG) {
			System.out.println("This is the Eight month of Year - Augest");
		}
		if (m == Month.SEP) {
			System.out.println("This is the Ninth month of Year - Sepetember");
		}
		if (m == Month.OCT) {
			System.out.println("This is the Tenth month of Year - October");
		}
		if (m == Month.NOV) {
			System.out.println("This is the eleventh month of Year - November");
		}
		if (m == Month.DEC) {
			System.out.println("This is the Twelth month of Year - December");
		}
	}
	
	
	public static void main(String[] args) {
		
		try {
			Demo demo = new Demo();
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter Month name in Capital and in Short way");
			String monthString = scanner.next();
			
			Month month = Month.valueOf(monthString);
			demo.showDetails(month);
		} 
		catch (Exception e) {
			System.out.println("Invalid Month Name");
		}
		
	}

	

}
