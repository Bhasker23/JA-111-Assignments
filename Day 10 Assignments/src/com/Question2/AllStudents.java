package com.Question2;

import java.util.Scanner;

public class AllStudents {
	
	public static void main(String[] args) {
			
		 Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Enter Science Student Name");
		 String name = scanner.nextLine();
		 
		 System.out.println("Enter Science Student Address");

		 String address = scanner.nextLine();
		 
		 System.out.println("Enter Phisics Marks");
		 int phisicsMarks =  scanner.nextInt();
		 
		 System.out.println("Enter Chemistry Marks");
		 int chemistryMarks = scanner.nextInt();
		 
		 System.out.println("Enter Maths Marks");
		 int mathsMarks = scanner.nextInt();
		
		ScienceStudent scienceStudent = new ScienceStudent(name, address);
		
		scienceStudent.setChemistryMarks(chemistryMarks);
		scienceStudent.setMathsMarks(mathsMarks);
		scienceStudent.setChemistryMarks(chemistryMarks);	
	
		scienceStudent.getPercentage();
		
		
		
		Scanner scanner1 = new Scanner(System.in);
		
		 System.out.println("Enter History Student Name");
		 String sName = scanner1.nextLine();
		 
		 System.out.println("Enter History Student Address");

		 String Saddress = scanner1.nextLine();
		 
		 System.out.println("Enter History Marks");
		 int historyMarks =  scanner1.nextInt();
		 
		 System.out.println("Enter Civics Marks");
		 int civicsMarks = scanner1.nextInt();
		 
		 System.out.println();
		 
		
		 HistoryStudent historyStudent =  new HistoryStudent(sName, address);
		 
		 historyStudent.setCivicsMarks(civicsMarks);
		 historyStudent.setHistoryMarks(historyMarks);
		 
		 historyStudent.getPercentage();
		
	}
}
