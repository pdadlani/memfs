package com.pdadlani.intersect.shapes;

public class Rectangle extends Polygon {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
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

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return 2 * length + 2 * width;
	}
	
	@Override
	public String toString() {
		if (isSquare()) {
			return "<Square side: " + length + ">";
		} else {
			return "<Rectangle length: " + length + ", width: " + width + ">";
		}
	}
}
