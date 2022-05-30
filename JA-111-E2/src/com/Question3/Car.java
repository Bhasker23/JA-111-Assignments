package com.Question3;


public class Car {
	
	int numberOfPassenger;
	int numberOfKms;


public Car bookCar(int numberOfPassenger, int numberOfKMs) {
	
	Sedan sedan = new Sedan();
	
	Hatchback hatchback = new Hatchback();
	
	if (numberOfPassenger <= 3 ) {
		return hatchback;
	}
	else {
		return sedan;
	}

}

public int calculateBill(Car car) {
	
	Car typeCar = car;
	
	
	System.out.println(typeCar );
	
	int amount = 0;
	
	
	
	
//	System.out.println("kms is "+typeCar.numberOfKms +" fare " + typeCar.farePerKm);

//	int amount = (typeCar.numberOfKms * typeCar.farePerKm  );
	
	
	return amount;
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
	
	
	@Override
	public String toString() {
		return "Sedan";
	}

	final int farePerKm =20;
}

class Hatchback extends Car{
	
	
	final int farePerKm =15;

	@Override
	public String toString() {
		return "Hatchback";
	}
	
}