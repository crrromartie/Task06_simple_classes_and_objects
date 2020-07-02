package main;

import by.htp.les.entity.Triangle;
import by.htp.les.logic.TriangleLogic;
import by.htp.les.view.TriangleView;

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(5, 8, 4);
		TriangleView tv = new TriangleView();
		TriangleLogic tl = new TriangleLogic();
		int perimeter = tl.perimeter(triangle);
		tv.info(triangle, perimeter);
		double square = tl.square(triangle);
		tv.info(triangle, perimeter, square);

	}

}
