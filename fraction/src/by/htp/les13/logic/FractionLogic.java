package by.htp.les13.logic;

import by.htp.les13.entity.Fraction;

public class FractionLogic {

	public Fraction add(Fraction f1, Fraction f2) {
		int newNumerator;
		int newDenominator;
		newNumerator = f1.getNumerator() * f2.getDenominator() + f1.getDenominator() * f1.getNumerator();
		newDenominator = f1.getDenominator() * f2.getDenominator();
		Fraction tempFraction = new Fraction(newNumerator, newDenominator);
		reduceFraction(tempFraction);
		return tempFraction;
	}

	public Fraction sub(Fraction f1, Fraction f2) {
		int newNumerator;
		int newDenominator;
		newNumerator = f1.getNumerator() * f2.getDenominator() - f1.getDenominator() * f2.getNumerator();
		newDenominator = f1.getDenominator() * f2.getDenominator();
		Fraction tempFraction = new Fraction(newNumerator, newDenominator);
		reduceFraction(tempFraction);
		return tempFraction;
	}

	public Fraction mul(Fraction f1, Fraction f2) {
		int newNumerator;
		int newDenominator;
		newNumerator = f1.getNumerator() * f2.getNumerator();
		newDenominator = f1.getDenominator() * f2.getDenominator();
		Fraction tempFraction = new Fraction(newNumerator, newDenominator);
		reduceFraction(tempFraction);
		return tempFraction;
	}

	public Fraction div(Fraction f1, Fraction f2) {
		int newNumerator;
		int newDenominator;
		newNumerator = f1.getNumerator() * f2.getDenominator();
		newDenominator = f1.getDenominator() * f2.getNumerator();
		Fraction tempFraction = new Fraction(newNumerator, newDenominator);
		reduceFraction(tempFraction);
		return tempFraction;
	}

	private void reduceFraction(Fraction f) {
		int nod;
		if (Math.abs(f.getNumerator()) < Math.abs(f.getDenominator())) {
			nod = Math.abs(f.getNumerator());
		} else {
			nod = Math.abs(f.getDenominator());
		}
		while (true) {
			if (((f.getNumerator() % nod) == 0) && ((f.getDenominator() % nod) == 0))
				break;
			nod--;
		}
		f.setNumerator(f.getNumerator() / nod);
		f.setDenominator(f.getDenominator() / nod);
	}
}
