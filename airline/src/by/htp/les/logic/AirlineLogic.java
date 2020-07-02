package by.htp.les.logic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import by.htp.les.entity.Airline;

public class AirlineLogic {

	public List<Airline> findDestination(String destination, List<Airline> airlines) {
		List<Airline> airlinesDestination = new ArrayList<Airline>();
		for (int i = 0; i < airlines.size(); i++) {
			if (destination.compareTo(airlines.get(i).getDestinationStation()) == 0) {
				airlinesDestination.add(airlines.get(i));
			}
		}
		return airlinesDestination;
	}

	public List<Airline> findDayWeek(String dayWeek, List<Airline> airlines) {
		List<Airline> airlinesDayWeek = new ArrayList<Airline>();
		for (int i = 0; i < airlines.size(); i++) {
			if (dayWeek.compareTo(airlines.get(i).getDayOfWeek()) == 0) {
				airlinesDayWeek.add(airlines.get(i));
			}
		}
		return airlinesDayWeek;
	}

	public List<Airline> findDayWeekAfterTime(String dayWeek, List<Airline> airlines, Calendar calendar) {
		List<Airline> airlinesDayWeek = new ArrayList<Airline>();
		airlinesDayWeek = findDayWeek(dayWeek, airlines);
		List<Airline> airlinesDayWeekAfterTime = new ArrayList<Airline>();
		for (int i = 0; i < airlinesDayWeek.size(); i++) {
			if (calendar.compareTo(airlinesDayWeek.get(i).getCalendar()) < 0) {
				airlinesDayWeekAfterTime.add(airlinesDayWeek.get(i));
			}
		}
		return airlinesDayWeekAfterTime;
	}

}
