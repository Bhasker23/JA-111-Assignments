package com.Question1;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		
		Hotel tHotel = new TajHotel();
		Hotel rHotel = new RoadSideHotel();
		
		if (amount > 1000) {
			TajHotel t= (TajHotel)tHotel;
			t.welcomeDrink();
			return tHotel;
		}
		else if (amount > 200 && amount < 1000) {
			return rHotel;
		}
		else {

			return null;
		}
		
	}

	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("Enter amount : ");
		int price = scanner.nextInt();
		
		if (price < 0) {
		System.out.println("Please Enter a valid amount");
		}
		else {
			Hotel d2 = d1.provideFood(price);
			System.out.println(d2);
			d2.chickenBiryani();
			d2.masalaDosa();
		
		}
		
		System.out.println();
	}
}
