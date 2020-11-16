package by.htp.les.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(245, "Иванов", "Иван", "Иванович","Красная 1", 1234, 12345678);
				
		CustomerAgregator agr = new CustomerAgregator();
		
		agr.add(customer);
		
		agr.add(new Customer(345,"Петров", "Петр", "Петрович", "Красная 2", 2345, 54134565));
		
		agr.add(new Customer(333,"Алексий", "Алекс", "Александрович", "Красная 3", 2222, 76458765));
		
		CustomersView View = new CustomersView();
		
		
		CustomerLogic logic = new CustomerLogic();
	
		View.print(logic.lastNameSort(agr));
		
		View.print(logic.numCardSort(agr));
		
	}

}
