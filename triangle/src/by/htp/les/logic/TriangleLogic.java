package by.htp.les.logic;

import by.htp.les.entity.Triangle;

public class TriangleLogic {

	public int perimeter(Triangle triangle) {
		int perimeter = triangle.getA() + triangle.getB() + triangle.getC();
		return perimeter;
	}

	public double square(Triangle triangle) {
		double a = (double) triangle.getA();
		double b = (double) triangle.getB();
		double c = (double) triangle.getC();
		double p = (a + b + c) / 2.0;
		double sqare = Math.sqrt(a * (p - a) * (p - b) * (p - c));
		return sqare;
	}

}
