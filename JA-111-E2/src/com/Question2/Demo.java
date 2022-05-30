package com.Question2;

import java.util.Scanner;



public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Student object need to be created ?");
		int number = sc.nextInt();
		int total_marks = 0 ;
		
		for (int i = 0; i < number; i++) {
			
			Student student = new Student();
			
			System.out.println();
			
			System.out.println("Enter student Roll No. : ");
			int roll = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Student Name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter Student Address :  ");
			String address = sc.nextLine();
			
			System.out.println("Enter Student Marks : ");
			int marks = sc.nextInt();
			
			total_marks +=  marks;
					
			student.setRoll(roll);
			student.setName(name);
			student.setMarks(marks);
			student.setAddress(address);
			
			System.out.println();
			
			System.out.println("Roll is : " + student.getRoll());
			System.out.println("Name is : " + student.getName());
			System.out.println("Adress is : " + student.getAddress());
			System.out.println("Marks is : " + student.getMarks());
			
		}
		
		System.out.println();
		
		int average = (total_marks/number);
		System.out.println("Average Marks is" + average);
		
		
	}
}
