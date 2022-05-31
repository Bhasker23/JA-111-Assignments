package com.Question3;


public class Car {
	
	private int numberOfPassenger;
	private   int numberOfKms;


public Car bookCar(int numberOfPassenger, int numberOfKMs) {
	
	Sedan sedan = new Sedan();
	
	Hatchback hatchback = new Hatchback();
	
	if (numberOfPassenger <= 3 ) {
		hatchback.setNumberOfPassenger(numberOfPassenger);
		hatchback.setNumberOfKms(numberOfKMs);
		return hatchback; 
	}
	else {
		sedan.setNumberOfKms(numberOfKMs);
		sedan.setNumberOfPassenger(numberOfPassenger);
		return sedan;
	}

}

public int calculateBill(Car car) {
	
	int x = 0;
	Car typeCar = car;
	
	if (typeCar instanceof Hatchback) {
		
		Hatchback hatchback = new Hatchback();
		
		int amount = (typeCar.numberOfKms * hatchback.farePerKm  );
		
		return amount;
	
	}
	else if (typeCar instanceof Sedan) {
		
		Sedan sedan = new Sedan();
		int amount = (typeCar.numberOfKms * sedan.farePerKm  );
		
		return amount;
	} 
	else {
		return x;
	}
	
	
	
//	return x;
	


	
}

public int getNumberOfPassenger() {
	return numberOfPassenger;
}

public void setNumberOfPassenger(int numberOfPassenger) {
	this.numberOfPassenger = numberOfPassenger;
}

public int getNumberOfKms() {
	return numberOfKms;
}

public void setNumberOfKms(int numberOfKms) {
	this.numberOfKms = numberOfKms;
}

}

class Sedan extends Car{

	final int farePerKm =20;
}

class Hatchback extends Car{
	
	final int farePerKm =15;

}