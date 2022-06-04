package com.Question1;

public class TajHotel implements Hotel{
	
	
	
	@Override
	public String toString() {
		return "You are in the Hotel Taj" ;
	}

	@Override
	public void chickenBiryani() {
		System.out.println("Eating chickenBiryani in Hotel Taj ");
		
	}

	@Override
	public void masalaDosa() {
		System.out.println("Eating masalaDosa Hotel Taj");

	}
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
		}

}
