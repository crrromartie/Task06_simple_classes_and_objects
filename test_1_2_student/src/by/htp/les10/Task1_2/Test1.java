package by.htp.les10.Task1_2;

public class Test1 {

	private int x;
	private int y;

	public Test1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Test1() {
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int sum() {
		int sum = x + y;
		return sum;
	}

	public int max() {
		int max = x;
		if (y > x) {
			max = y;
		}
		return max;
	}

	public void info() {
		System.out.println("X = " + x + " Y = " + y);
	}

}
