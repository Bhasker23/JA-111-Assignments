package com.Question2;

public class Question2 {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setExamFee(500);
		s.setStudId(436);
		s.setStudName("Bhasker");
		
		s.displayDetails();
		
	}

}
//1
 class Student{
	 
	 int studId ;
	 String studName;
	 double examFee;
	 
	  Student(){
		 
		 super();
		  
	 }
	  
//	  settermethod?
	  
	  public void setStudId(int studId) {
		this.studId = studId;
	}
	  public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	  public void setStudName(String studName) {
		this.studName = studName;
	}
	  
//	  gettermethod****************
	  
	  public double getExamFee() {
		return examFee;
	}public int getStudId() {
		return studId;
	}public String getStudName() {
		return studName;
	}
	 
	 void displayDetails() {
		 
		  DayScholar d = new DayScholar();
	         double j = d.transportFee();
	         
	         System.out.println("transportFees :"+j);
		 System.out.println("Name :"+getStudName());
         payFee();
         
       
        
		 
	 }
	 
	 void payFee() {
		  DayScholar d = new DayScholar();
	         double j = d.transportFee();
	         
	         
		 
		 System.out.println("Exam fees :"+ getExamFee()+j);
	 }
	 
	 
	
}
 
 
 
 
 
 //2
 
 
 class DayScholar extends Student{
	 
	 public double transportFee() {
		return 345;
		 
	 }
	 
 }
 
 
 //3
 class Hosteller extends DayScholar{
	 
	 double hosteFee;
	 
	 void Hosteller() {
		 
	 }
	 
//	 int  payFee() {
//		 return 456 ;
//	 }
	 
 }
