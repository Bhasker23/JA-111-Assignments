package com.Question2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Mobile company Name");
		String company = scanner.nextLine();
		
		System.out.println("Enter Mobile company Name");
		String model = scanner.nextLine();
		
		mobile.searchOutdatedModel(company, model);
		
	}
}
