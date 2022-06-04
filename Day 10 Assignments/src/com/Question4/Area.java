package com.Question4;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		return length * breadth;
	}

	@Override
	public int squareArea(int side) {
		return side * side;
	}

	@Override
	public int circleArea(int radius) {
		return (2 * 3 * radius);
	}

}
