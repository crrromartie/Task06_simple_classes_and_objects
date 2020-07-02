package by.htp.les.logic;

import by.htp.les.entity.Clock;

public class ClockLogic {

	public Clock changeHour(Clock clock, final int h) {
		int temp = clock.getHour();
		clock.setHour(temp + h);
		return clock;
	}

	public Clock changeMinute(Clock clock, final int m) {
		int temp = clock.getMinute();
		clock.setMinute(temp + m);
		return clock;
	}

	public Clock changeSecond(Clock clock, final int s) {
		int temp = clock.getSecond();
		clock.setSecond(temp + s);
		return clock;
	}
}
