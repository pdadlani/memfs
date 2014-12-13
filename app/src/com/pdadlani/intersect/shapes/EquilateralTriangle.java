package com.pdadlani.intersect.shapes;

public class EquilateralTriangle extends Polygon {
	
	private double side;
	
	public EquilateralTriangle(double side) {
		this.side = side;
	}

	@Override
	public int getNumSides() {
		return 3;
	}

	@Override
	public double getArea() {
		return Math.sqrt(3) * Math.pow(side, 2) / 4;
	}

	@Override
	public double getPerimeter() {
		return 3 * side;
	}
	
	@Override
	public String toString() {
		return "<Equilateral Triangle: " + side + ">";
	}
}
