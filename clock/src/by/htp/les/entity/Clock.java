package by.htp.les.entity;

public class Clock {

	private int hour;
	private int minute;
	private int second;

	private final static int MIN_S;
	private final static int MAX_S;
	private final static int MIN_M;
	private final static int MAX_M;
	private final static int MIN_H;
	private final static int MAX_H;

	static {
		MIN_S = 0;
		MAX_S = 60;
		MIN_M = 0;
		MAX_M = 60;
		MIN_H = 0;
		MAX_H = 24;
	}

	public Clock() {
		super();
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public Clock(int hour, int minute, int second) {
		super();
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour > MAX_H || hour < MIN_H) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute > MAX_M || minute < MIN_M) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second > MAX_S || second < MIN_S) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
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
		Clock other = (Clock) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clock [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

}
