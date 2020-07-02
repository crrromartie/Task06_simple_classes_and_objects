package by.htp.les.main;

import by.htp.les.entity.Clock;
import by.htp.les.logic.ClockLogic;
import by.htp.les.view.ClockView;

public class Main {

	public static void main(String[] args) {

		Clock clock = new Clock(7, 2, 6);
		ClockView cv = new ClockView();
		ClockLogic cl = new ClockLogic();

		cv.info(clock);
		cl.changeHour(clock, -1);
		cl.changeMinute(clock, 5);
		cl.changeSecond(clock, 7);
		cv.info(clock);

	}

}
