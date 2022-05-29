package com.Question4;

import java.util.*;

public class Question4 {
	
	public static void getBank(String Bank)
	{
		if(Bank == "axis")
		{
			AxisBank a = new AxisBank("Axis", "AXI569");
			a.displayDetails();
			a.getCreditCard();
			a.setRateOfinterest(8);
			System.out.println("Interest in per :"+a.getRateOfinterest());
			
			
		}
		if(Bank =="icici")
		{
			ICICIBank i = new ICICIBank("ICICI", "ICI5678");
			i.displayDetails();
//			i.rateOfinterest = 8;
			i.setRateOfinterest(10);
			System.out.println("Interest in per :"+ i.getRateOfinterest()); 
		
		}
		
	}
	
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Please Enter your Bank Name");
//		String b = scan.next();
		
		getBank("axis");
		
		
		
	}
	

}





class Bank{
	String branchName;
  String ifscCode;
  
  Bank(String branchName,String ifscCode){
	  this.branchName= branchName;
	  this.ifscCode = ifscCode;
	  
	  
	  
	  
  }
  
  void displayDetails() {
	  
	  System.out.println("Branch Name :"+ branchName);
	  System.out.println("Ifsc Code :"+ ifscCode);
	  
  }
}



class AxisBank extends Bank{
	
	double rateOfinterest;
	

	AxisBank(String branchName, String ifscCode) {
		super(branchName, ifscCode);
		
	}
	
	@Override
	void displayDetails() {
	
		super.displayDetails();
//		System.out.println("Interest in per :"+rateOfinterest);
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	
	public void setRateOfinterest(double rateOfinterest) {
		this.rateOfinterest = rateOfinterest;
	}
	public double getRateOfinterest() {
		return rateOfinterest;
	}
}




class ICICIBank extends Bank{
	
 double	rateOfinterest;

	ICICIBank(String branchName, String ifscCode) {
		super(branchName, ifscCode);
		
	}
	@Override
	void displayDetails() {
	
		super.displayDetails();
//		System.out.println("Interest in per :"+rateOfinterest);
	}
	
	public void setRateOfinterest(double rateOfinterest) {
		this.rateOfinterest = rateOfinterest;
	}
	public double getRateOfinterest() {
		return rateOfinterest;
	}
	
}


