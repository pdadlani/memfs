package com.pdadlani.intersect.integrals;

import java.util.ArrayList;

public class Integral {
	
	public double getIntegral(ArrayList<Double> eqCoeff, double xinitial, double xfinal, double numOfRect) {
		double recWidth = (xfinal - xinitial) / numOfRect;
		double sumYValues = 0;
		for (int i = 0; i < numOfRect; i++) {
			double yvalue = calcYValue(eqCoeff, xinitial + i * recWidth);
			sumYValues = sumYValues + yvalue;
		}
		return sumYValues * recWidth;
	}
	
	/*
	 * Calculates the y value for the appropriate x value.
	 */
	public double calcYValue(ArrayList<Double> eqCoeff, double xvalue) {
		double yvalue = 0;
		for (int i = 0; i < eqCoeff.size(); i++) {
			double iCoeff = eqCoeff.get(i);
			yvalue = yvalue + iCoeff * Math.pow(xvalue, i);
		}
		return yvalue;
	}
}
