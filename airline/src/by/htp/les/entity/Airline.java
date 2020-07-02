package by.htp.les.entity;

import java.util.Calendar;

public class Airline {

	private String destinationStation;
	private int flightNumber;
	private String typeOfAirplane;
	private Calendar calendar;
	private String dayOfWeek;

	public Airline() {
		this.destinationStation = null;
		this.flightNumber = 0;
		this.typeOfAirplane = null;
		this.calendar = null;
		this.dayOfWeek = null;
	}

	public Airline(String destinationStation, int flightNumber, String typeOfAirplane, Calendar calendar,
			String dayOfWeek) {
		this.destinationStation = destinationStation;
		this.flightNumber = flightNumber;
		this.typeOfAirplane = typeOfAirplane;
		this.calendar = calendar;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTypeOfAirplane() {
		return typeOfAirplane;
	}

	public void setTypeOfAirplane(String typeOfAirplane) {
		this.typeOfAirplane = typeOfAirplane;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calendar == null) ? 0 : calendar.hashCode());
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + ((destinationStation == null) ? 0 : destinationStation.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((typeOfAirplane == null) ? 0 : typeOfAirplane.hashCode());
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
		Airline other = (Airline) obj;
		if (calendar == null) {
			if (other.calendar != null)
				return false;
		} else if (!calendar.equals(other.calendar))
			return false;
		if (dayOfWeek == null) {
			if (other.dayOfWeek != null)
				return false;
		} else if (!dayOfWeek.equals(other.dayOfWeek))
			return false;
		if (destinationStation == null) {
			if (other.destinationStation != null)
				return false;
		} else if (!destinationStation.equals(other.destinationStation))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (typeOfAirplane == null) {
			if (other.typeOfAirplane != null)
				return false;
		} else if (!typeOfAirplane.equals(other.typeOfAirplane))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destinationStation=" + destinationStation + ", flightNumber=" + flightNumber
				+ ", typeOfAirplane=" + typeOfAirplane + ", calendar=" + calendar + ", dayOfWeek=" + dayOfWeek + "]";
	}

}
