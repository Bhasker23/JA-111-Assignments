package com.JA111.C1.Prob2;

import java.util.Scanner;

public class Course {

	int courseId; 
	String courseName;
	int courseFee;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getCourseFee() {
		return courseFee;
	}
	
	
	public void displayCourseDetails() {
		System.out.println("Course Seld is : " + getCourseId());
		System.out.println("Course Name is : " + getCourseName());
		System.out.println("Course Fee is  : " + getCourseFee());
		
	}
	
	public static void authenticate(String username, String password) {
		
		if (username == "Admin" && password == "1234") {
			
			Course c1 = new Course();
			
			Scanner course1 = new Scanner(System.in);
			
			System.out.println("Enter the value of courseseld");
			int courseeld = course1.nextInt();
			
			course1.nextLine();
			
			System.out.println("Enter course Name");
			String courseName = course1.nextLine();
			
			System.out.println("Enter course Fee");
			int courseFee = course1.nextInt();
			
			c1.setCourseId(courseeld);
			c1.setCourseName(courseName);
			c1.setCourseFee(courseFee);
			
			c1.displayCourseDetails();
			course1.close();
			
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Calling by Valid USername or Password");
		
		System.out.println();
		
		Course.authenticate("Admin", "1234");
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Calling by invalid USername or Password");
		
		System.out.println();
		
		Course.authenticate(null, null);
	}
	
	
}
