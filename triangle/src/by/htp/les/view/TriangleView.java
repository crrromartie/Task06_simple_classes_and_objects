package by.htp.les.view;

import by.htp.les.entity.Triangle;

public class TriangleView {

	public void info(Triangle triangle) {
		System.out.printf("A = %d B = %d C = %d\n", triangle.getA(), triangle.getB(), triangle.getC());
	}

	public void info(Triangle triangle, int perimeter) {
		System.out.printf("A = %d B = %d C = %d Perimeter = %d\n", triangle.getA(), triangle.getB(), triangle.getC(),
				perimeter);
	}

	public void info(Triangle triangle, int perimeter, double square) {
		System.out.printf("A = %d B = %d C = %d Perimeter = %d Square = %.2f\n", triangle.getA(), triangle.getB(),
				triangle.getC(), perimeter, square);
	}

}
