package com.Question4;

public class Main {
	
	public static void main(String[] args) {
		Area area = new Area();
		
		System.out.println("Circle area is -  "+area.circleArea(2));
		System.out.println("Rectangle area is -"+area.rectangleArea(5, 4));
		System.out.println("Square area is "+area.squareArea(7));
	}
}
