package com.pdadlani.intersect;

import java.util.ArrayList;

import com.pdadlani.intersect.integrals.Integral;
import com.pdadlani.intersect.shapes.EquilateralTriangle;
import com.pdadlani.intersect.shapes.Rectangle;
import com.pdadlani.intersect.shapes.Shape;

public class Main {

	public static void main(String... args) {
		System.out.println("Hello Talls! From Pwiggles' laptop!!");
		
		Shape r1020 = new Rectangle(10, 20);
		Rectangle r3030 = new Rectangle(30, 30);
		EquilateralTriangle t3 = new EquilateralTriangle(3.14);
		
		ArrayList<Shape> shapesList = new ArrayList<Shape>();
		shapesList.add(r1020);
		shapesList.add(r3030);
		shapesList.add(t3);
		
		double sumArea = 0;
		
		for (int i = 0; i < shapesList.size(); i++) {
			sumArea = sumArea + shapesList.get(i).getArea();
		}
		
		ArrayList<Double> eq = new ArrayList<Double>();
		eq.add(7.);
		eq.add(2.);
		eq.add(3.);
		eq.add(5.0);
		
		Integral fts = new Integral();
		
		System.out.println(fts.getIntegral(eq, 0, 10, 100000));

		/*
		
		System.out.println(shapesList.get(0).getArea());
		
		System.out.println(shapesList.size());
		
		System.out.println(sumArea);
		
		System.out.println(t3);	
		System.out.println(t3);
		System.out.println(r1020);
		System.out.println(r3030);
		System.out.println(shapesList);
		*/
	}

}
