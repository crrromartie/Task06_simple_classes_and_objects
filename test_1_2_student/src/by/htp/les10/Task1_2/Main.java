package by.htp.les10.Task1_2;

public class Main {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		int a = 3;
		int b = 4;
		t1.setX(a);
		t1.setY(b);
		t1.info();
		int z;
		z = t1.sum();

		System.out.println("Max = " + t1.max());
		System.out.println("Sum = " + z);

	}

}
