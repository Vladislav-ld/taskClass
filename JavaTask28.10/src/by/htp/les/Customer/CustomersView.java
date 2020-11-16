package by.htp.les.Customer;

public class CustomersView {
	
	public void print(CustomerAgregator bank) {

		for( int i = 0; i < bank.getCustomers().size(); i++) {

			Customer customer = bank.getCustomers(i);
			
			System.out.println("Id : " + customer.getId());
			
			System.out.println("LastName : " + customer.getLastName());
			
			System.out.println("Name : " + customer.getName());
			
			System.out.println("MiddleNAme : " + customer.getMiddleName());
			
			System.out.println("Adress : " + customer.getAdress());
			
			System.out.println("NumBank : " + customer.getNumBank());
			
			System.out.println("NumCard : " + customer.getNumCard());
		}
		
			
	
	}
}
