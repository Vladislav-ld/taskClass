package by.htp.les.Airline;

import java.util.ArrayList;
import java.util.List;


public class Airport {
	
	private List<AirLine> airport;
	
	public Airport() {
		airport = new ArrayList<AirLine>();
	}
	
	public void add(AirLine airline) {
		airport.add(airline);
	}
	
	public List<AirLine> getAirport() {
		return airport;
	}
	
	public AirLine getAirLine(int index) {
		if( index >= airport.size()) {
			return null;
		}
		return airport.get(index);
	}
	
	

}
