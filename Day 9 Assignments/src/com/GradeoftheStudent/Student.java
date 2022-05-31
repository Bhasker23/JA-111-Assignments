package com.GradeoftheStudent;

import java.util.Scanner;

public class Student {

	private  int roll;
	private String name;
	private int marks;
	private char grade;


	public void displayDetails() {
		
		Student s1 = new Student();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter roll number");
		int roll = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter Name..");
		String name = scanner.nextLine();
		
		System.out.println("Enter Marks..");
		int marks = scanner.nextInt();
		
		s1.setRoll(roll);
		s1.setName(name);
		s1.setMarks(marks);
		
		char grade  = s1.calculateGrade(marks);
		char x = 'a';
		int y = 'a';
		System.out.println(x);
		System.out.println(y);

	}



	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	private char calculateGrade(int marks){
		
	
		
		
		if (marks >= 500 )  {
			return 'A';
		}
		else if (marks < 500 && marks >= 400) {
			return 'B';
		}
		else {
			return 'x';
		}
		
		
//		
		
	}
}

