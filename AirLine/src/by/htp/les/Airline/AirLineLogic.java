package by.htp.les.Airline;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class AirLineLogic {
	public Airport findDestination(Airport airport, String destination) {
		Airport _airport = new Airport();
		
		for(int i = 0; i < airport.getAirport().size(); i++) {
			if(airport.getAirLine(i).getDestination().compareTo(destination) == 0) {
				_airport.add(airport.getAirLine(i));
			}
		}
		return _airport;
	}
	
	public Airport findDay(Airport airport, DayOfWeek day) {
		Airport _airport = new Airport();
		
		for(int i = 0; i < airport.getAirport().size(); i++) {
			if(airport.getAirLine(i).getWeekDays() == day) {
				_airport.add(airport.getAirLine(i));
			}
		}
		return _airport;
	}
	
	public Airport findDayTime(Airport airport, DayOfWeek weekDays, LocalTime departureTime) {
		Airport _airport = new Airport();
		
		for(int i = 0; i < airport.getAirport().size(); i++) {
			if(airport.getAirLine(i).getWeekDays() == weekDays) {
				if(airport.getAirLine(i).getDepartureTime().equals(departureTime)) {
					_airport.add(airport.getAirLine(i));
				}
			}
		}
		return _airport;
	}
	
	

}
