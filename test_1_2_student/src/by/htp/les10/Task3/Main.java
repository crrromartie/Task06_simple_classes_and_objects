package by.htp.les10.Task3;

public class Main {

	public static void main(String[] args) {

		StudentView sw = new StudentView();
		StudentLogic sl = new StudentLogic();

		Student[] s = new Student[6];
		s[0] = new Student("Ben", "Perry", 15, new int[] { 6, 7, 8, 9, 9 });
		s[1] = new Student("Oleg", "Pupkin", 15, new int[] { 8, 9, 9, 9, 9 });
		s[2] = new Student("Alex", "Jonson", 15, new int[] { 9, 8, 9, 9, 9 });
		s[3] = new Student("Edward", "Bill", 14, new int[] { 2, 2, 2, 2, 2 });
		s[4] = new Student("Stiven", "Sigal", 14, new int[] { 9, 9, 9, 9, 9 });
		s[5] = new Student("Arnold", "Swarcneger", 14, new int[] { 9, 7, 9, 9, 9 });

		Student[] botan;
		botan = sl.botan(s);
		sw.viewInfo(botan);

	}

}
