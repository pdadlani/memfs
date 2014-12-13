package com.pdadlani.intersect.shapes;

public abstract class Polygon extends Shape{

	public abstract int getNumSides();
	
	@Override
	public String toString() {
		return "<Polygon: " + this.getNumSides() + ">";
	}
}
