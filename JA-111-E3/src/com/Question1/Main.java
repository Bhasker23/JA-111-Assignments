package com.Question1;

import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
			System.out.println("Start Main");
		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the size of array : ");
			int size = scanner.nextInt();
			
			int [] arr = new int[size];
			
			for (int i = 0; i < arr.length; i++) {
				
				System.out.println("Enter an element");
				int element = scanner.nextInt();
			
			
			System.out.println("Enter index you want to access");
			int index = scanner.nextInt();
			
			arr[index] = element;
			
			if (index <= size) {
				System.out.println("The array element at " + index + " = " + arr[index] );
			}
			}
	
		} 		
	catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a.toString());
		}
		
		catch (NumberFormatException n) {
			System.out.println(n.toString());
		}
		
		System.out.println("end Main");
		
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
}
}
