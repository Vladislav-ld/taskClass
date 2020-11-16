package by.htp.les.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerAgregator {
	
	private List<Customer> customers;
	
	public CustomerAgregator() {
		customers = new ArrayList<Customer>();
	}
	
	public void add (Customer c) {
		customers.add(c);
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}
	
	
	public Customer getCustomers(int index) {
		if( index >= customers.size()) {
			return null;
		}
		
		return customers.get(index);
	}
	
	

}
