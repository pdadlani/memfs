package com.pdadlani.intersect.shapes;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public int getNumSides() {
		return 4;
	}
	
	public boolean isSquare() {
		return length == width;
	}

}
