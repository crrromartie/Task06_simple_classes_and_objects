package by.htp.les13.main;

import by.htp.les13.entity.Fraction;
import by.htp.les13.logic.FractionLogic;
import by.htp.les13.view.FractionView;

public class Main3 {

	public static void main(String[] args) {
		FractionLogic logic = new FractionLogic();
		FractionView view = new FractionView();

		Fraction fr1 = new Fraction(1, 2);
		Fraction fr2 = new Fraction(1, 4);
		Fraction add = logic.add(fr1, fr2);
		view.printAddExpression(fr1, fr2, add);

		Fraction fr3 = new Fraction(1, 2);
		Fraction fr4 = new Fraction(1, 4);
		Fraction sub = logic.sub(fr3, fr4);
		view.printSubExpression(fr3, fr4, sub);

		Fraction fr5 = new Fraction(1, 2);
		Fraction fr6 = new Fraction(1, 4);
		Fraction mul = logic.mul(fr5, fr6);
		view.printMulExpression(fr5, fr6, mul);

		Fraction fr7 = new Fraction(1, 2);
		Fraction fr8 = new Fraction(1, 4);
		Fraction div = logic.div(fr7, fr8);
		view.printDivExpression(fr7, fr8, div);
	}

}
