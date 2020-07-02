package by.htp.les.main;

import java.util.GregorianCalendar;
import java.util.List;
import by.htp.les.entity.Airline;
import by.htp.les.entity.Airport;
import by.htp.les.logic.AirlineLogic;
import by.htp.les.view.AirlineView;

public class Main {

	public static void main(String[] args) {

		Airport airport = new Airport();
		AirlineView av = new AirlineView();
		AirlineLogic al = new AirlineLogic();

		airport.addAirline(new Airline("Boston", 412, "Long-haul", new GregorianCalendar(2020, 7, 25, 17, 30), "Tue"));
		airport.addAirline(new Airline("Chicago", 418, "Long-haul", new GregorianCalendar(2020, 8, 3, 14, 20), "Thu"));
		airport.addAirline(new Airline("Boston", 428, "Long-haul", new GregorianCalendar(2020, 7, 26, 17, 00), "Wed"));
		airport.addAirline(new Airline("Tampa", 432, "Long-haul", new GregorianCalendar(2020, 7, 27, 15, 30), "Thu"));
		airport.addAirline(new Airline("Gomel", 417, "Short-haul", new GregorianCalendar(2020, 8, 17, 10, 15), "Thu"));
		airport.addAirline(new Airline("NewYork", 414, "Long-haul", new GregorianCalendar(2020, 8, 8, 13, 00), "Tue"));

		List<Airline> airlinesDestination;
		airlinesDestination = al.findDestination("Boston", airport.getAirlines());
		av.printAllAirlines("By destination", airlinesDestination);

		System.out.println();
		List<Airline> airlinesByDayOfWeek;
		airlinesByDayOfWeek = al.findDayWeek("Tue", airport.getAirlines());
		av.printAllAirlines("By day of week", airlinesByDayOfWeek);

		System.out.println();
		List<Airline> findDayWeekAfterTime;
		findDayWeekAfterTime = al.findDayWeekAfterTime("Tue", airport.getAirlines(),
				new GregorianCalendar(2020, 8, 1, 17, 30));
		av.printAllAirlines("By day of week after some time", findDayWeekAfterTime);

	}

}
