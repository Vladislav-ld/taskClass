package by.htp.les.Airline;

public class AirLineView {
	
	public void print(Airport airport) {
		for(int i = 0; i < airport.getAirport().size(); i++) {
			
			AirLine airLine = airport.getAirLine(i);
			
			System.out.println("destination = " + airLine.getDestination());
			System.out.println("num = " + airLine.getNum());
			System.out.println("TypePlane = " + airLine.getTypePlane());
			System.out.println("departureTime = " + airLine.getDepartureTime());
			System.out.println("WeekDay = " + airLine.getWeekDays());
		}
		
	}

}
