package by.htp.les.entity;

public class Triangle {

	private int a;
	private int b;
	private int c;

	public Triangle() {
		super();
		this.a = 5;
		this.b = 5;
		this.c = 5;
	}

	public Triangle(int a, int b, int c) {
		this();
		if (!isReal(a, b, c)) {
			setA(a);
			setB(b);
			setC(c);
		} else {
			this.a = 5;
			this.b = 5;
			this.c = 5;
		}
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		if (a <= 0) {
			this.a = 1;
		} else {
			this.a = a;
		}
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		if (b <= 0) {
			this.b = 1;
		} else {
			this.b = b;
		}
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		if (c <= 0) {
			this.c = 1;
		} else {
			this.c = c;
		}
	}

	public boolean isReal(int a, int b, int c) {
		if (a + b <= c || a + c <= b || b + c <= a) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		result = prime * result + c;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		if (c != other.c)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
