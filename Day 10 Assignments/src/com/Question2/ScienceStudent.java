package com.Question2;

public class ScienceStudent  extends Student{

	int phisicsMarks;
	int chemistryMarks;
	int	mathsMarks;
	
	public ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public int getPhisicsMarks() {
		return phisicsMarks;
	}

	public void setPhisicsMarks(int phisicsMarks) {
		this.phisicsMarks = phisicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	@Override
	void getPercentage() {
		int totalMarks =  this.getChemistryMarks() + this.getMathsMarks() + this.chemistryMarks;
		double  percentage =(((double) totalMarks / 300 )*100) ;
		System.out.println("Percentage of Science student is : " + percentage);
	}

}
