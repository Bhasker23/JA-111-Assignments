package com.Question3;

import java.util.Scanner;



public class Main {
	
	

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of Passenger.. ");
		int passenger = scanner.nextInt();
		
		System.out.println("Enter Number of kms : ");
		int Kms = scanner.nextInt();
		
		myCar.setNumberOfKms(Kms);
		myCar.setNumberOfPassenger(passenger);
		
		Car bookMyCar = myCar.bookCar(passenger, Kms);
		
		int totalFare = myCar.calculateBill(bookMyCar); 
		
		System.out.println("Total Fare is : " + totalFare);
		
		
	
	}
}
