package by.htp.les.view;

import by.htp.les.entity.Clock;

public class ClockView {

	public void info(Clock clock) {

		String formattingHours;

		if (clock.getHour() < 10) {
			formattingHours = "0" + clock.getHour();

		} else {
			formattingHours = "" + clock.getHour();
		}

		String formattingMinutes;

		if (clock.getMinute() < 10) {
			formattingMinutes = "0" + clock.getMinute();

		} else {
			formattingMinutes = "" + clock.getMinute();
		}

		String formattingSeconds;

		if (clock.getSecond() < 10) {
			formattingSeconds = "0" + clock.getSecond();

		} else {
			formattingSeconds = "" + clock.getSecond();
		}

		System.out.printf("Hour: %s Minute: %s Second: %s\n", formattingHours, formattingMinutes, formattingSeconds);

	}

}
