package by.htp.les.Airline;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class AirLine {
	
	private String destination;
	private int num;
	private String typePlane;
	private LocalTime departureTime;
    private DayOfWeek weekDays;
    
    public AirLine(String destination, int num, String typePlane, LocalTime departureTime, DayOfWeek weekDays) {
    	this.destination = destination;
    	this.num = num;
    	this.typePlane = typePlane;
    	this.departureTime = departureTime;
    	this.weekDays = weekDays;
    }
    
    public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTypePlane() {
		return typePlane;
	}

	public void setTypePlane(String typePlane) {
		this.typePlane = typePlane;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public DayOfWeek getWeekDays() {
		return weekDays;
	}
	

	public void setWeekDays(DayOfWeek weekDays) {
		this.weekDays = weekDays;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + num;
		result = prime * result + ((typePlane == null) ? 0 : typePlane.hashCode());
		result = prime * result + ((weekDays == null) ? 0 : weekDays.hashCode());
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
		AirLine other = (AirLine) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (num != other.num)
			return false;
		if (typePlane == null) {
			if (other.typePlane != null)
				return false;
		} else if (!typePlane.equals(other.typePlane))
			return false;
		if (weekDays != other.weekDays)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AirLine [destination=" + destination + ", num=" + num + ", typePlane=" + typePlane + ", departureTime="
				+ departureTime + ", weekDays=" + weekDays + "]";
	}

	
	

}
