package com.Question2;

public class HistoryStudent extends Student {

	int historyMarks;
	int civicsMarks;
	
	public HistoryStudent(String name, String address) {
		super(name, address);
		
	}

	@Override
	void getPercentage() {
		int totalMarks = historyMarks + civicsMarks;
		double percentage = (((double) totalMarks / 300) * 100);
		System.out.println("Percentage of History student is : " + percentage);
		
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}

	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}
	
	

}
