package by.htp.les.Airline;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		
		Airport airport = new Airport();
		
		airport.add(new AirLine("a", 1,"a", LocalTime.parse("09:30"), DayOfWeek.MONDAY));
		airport.add(new AirLine("a", 2,"b", LocalTime.parse("11:30"), DayOfWeek.SATURDAY));
		airport.add(new AirLine("a", 3,"c", LocalTime.parse("12:00"), DayOfWeek.FRIDAY));
		airport.add(new AirLine("b", 4,"d", LocalTime.parse("00:30"), DayOfWeek.WEDNESDAY));
		airport.add(new AirLine("b", 5,"a", LocalTime.parse("14:00"), DayOfWeek.MONDAY));
		airport.add(new AirLine("b", 6,"b", LocalTime.parse("16:00"), DayOfWeek.TUESDAY));
		airport.add(new AirLine("c", 7,"c", LocalTime.parse("20:30"), DayOfWeek.FRIDAY));
		airport.add(new AirLine("c", 8,"d", LocalTime.parse("08:00"), DayOfWeek.MONDAY));
		
		AirLineLogic logic = new AirLineLogic();
		
		AirLineView view = new AirLineView();
		
		view.print(logic.findDay(airport, DayOfWeek.MONDAY));
		
		view.print(logic.findDayTime(airport, DayOfWeek.MONDAY, LocalTime.parse("08:00")));
		
		view.print(logic.findDestination(airport, "b"));
	}

}
