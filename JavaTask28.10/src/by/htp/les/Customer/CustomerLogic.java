package by.htp.les.Customer;

import java.util.Scanner;

public class CustomerLogic {

	public CustomerAgregator lastNameSort(CustomerAgregator bank) {

		Customer customerSecond = new Customer(0, null, null, null, null, 0, 0);
		
		boolean needIteration = true;
		
		while(needIteration) {
			needIteration = false;
			
			for( int i = 1; i < bank.getCustomers().size(); i++){
				
				if(bank.getCustomers(i).getLastName().compareTo(bank.getCustomers(i - 1).getLastName()) < 0) {
					
					customerSecond.setAdress(bank.getCustomers(i).getAdress());
					customerSecond.setId(bank.getCustomers(i).getId());
					customerSecond.setLastName(bank.getCustomers(i).getLastName());
					customerSecond.setMiddleName(bank.getCustomers(i).getMiddleName());
					customerSecond.setName(bank.getCustomers(i).getName());
					customerSecond.setNumBank(bank.getCustomers(i).getNumBank());
					customerSecond.setNumCard(bank.getCustomers(i).getNumCard());
														
					bank.getCustomers(i).setAdress(bank.getCustomers(i - 1).getAdress());
					bank.getCustomers(i).setId(bank.getCustomers(i - 1).getId());
					bank.getCustomers(i).setLastName(bank.getCustomers(i - 1).getLastName());
					bank.getCustomers(i).setMiddleName(bank.getCustomers(i - 1).getMiddleName());
					bank.getCustomers(i).setName(bank.getCustomers(i - 1).getName());
					bank.getCustomers(i).setNumBank(bank.getCustomers(i - 1).getNumBank());
					bank.getCustomers(i).setNumCard(bank.getCustomers(i - 1).getNumCard());					
					
					bank.getCustomers(i - 1).setAdress(customerSecond.getAdress());
					bank.getCustomers(i - 1).setId(customerSecond.getId());
					bank.getCustomers(i - 1).setLastName(customerSecond.getLastName());
					bank.getCustomers(i - 1).setMiddleName(customerSecond.getMiddleName());
					bank.getCustomers(i - 1).setName(customerSecond.getName());
					bank.getCustomers(i - 1).setNumBank(customerSecond.getNumBank());
					bank.getCustomers(i - 1).setNumCard(customerSecond.getNumCard());
					
					needIteration = true;
				}
			}
		}
		return bank;
	}
	
	public CustomerAgregator numCardSort(CustomerAgregator bank) {
		
		Scanner sc = new Scanner(System.in);
		
		if(!sc.hasNextInt()) {
			sc.next();
		}
		int num = sc.nextInt();
		
		CustomerAgregator _bank = new CustomerAgregator();
		
		for( int i = 0; i < bank.getCustomers().size(); i++){
			if(bank.getCustomers(i).getNumCard() == num) {
				_bank.add(bank.getCustomers(i));
			}
		}
		
		return _bank;
	}

}
