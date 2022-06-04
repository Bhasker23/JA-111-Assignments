package com.Question2;


public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String comapny,  String...models){
		
	for (String y : models) {
			boolean flag = false;
			for (String x : outdatedModels) {
				if (y.equals(x)) {
					System.out.println(y+"_OUTDATED");
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(y+" is Latest.");
			}
		}
	}
	 
}
