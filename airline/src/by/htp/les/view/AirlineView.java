package by.htp.les.view;

import java.util.List;
import by.htp.les.entity.Airline;

public class AirlineView {

	public void printAllAirlines(String message, List<Airline> airlines) {
		System.out.println(message);
		for (Airline airline : airlines) {
			printOneAirline(airline);
		}

	}

	public void printOneAirline(Airline airline) {
		System.out.println("Destination station:" + airline.getDestinationStation() + "/Flight number:"
				+ airline.getFlightNumber() + "/Type of airplane:" + airline.getTypeOfAirplane() + "/Date:"
				+ airline.getCalendar().getTime());
	}

}
