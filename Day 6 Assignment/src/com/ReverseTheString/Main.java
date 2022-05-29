package com.ReverseTheString;


import java.util.Scanner;

public class Main {
	
	public static String reversString(String input){
		
		String[] str = input.split("");
		

		
		String s1 = "";

		for (int i = str.length-1; i>=0 ; i--) {
			s1 += str[i];
			
		}
		
		return s1;
		}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString = sc.next();
		
		String result = reversString(originalString);
		
		System.out.println("Original String is : " + originalString);
		System.out.println("Reverse String is  : " + result);
		
		sc.close();
	}
	

}
