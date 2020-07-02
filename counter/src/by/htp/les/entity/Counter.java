package by.htp.les.entity;

public class Counter {

	private int counter;
	private int max;
	private int min;

	{
		counter = 50;
		max = 100;
		min = 0;
	}

	public Counter() {
		super();
		this.counter = 40;
		this.max = 100;
		this.min = 0;
	}

	public Counter(int counter, int max, int min) {
		super();
		this.counter = counter;
		this.max = max;
		this.min = min;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		if (counter > max) {
			this.counter = max;
		} else if (counter < min) {
			this.counter = min;
		} else {
			this.counter = counter;
		}
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
		result = prime * result + max;
		result = prime * result + min;
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
		Counter other = (Counter) obj;
		if (counter != other.counter)
			return false;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Counter [counter=" + counter + ", max=" + max + ", min=" + min + "]";
	}

}
