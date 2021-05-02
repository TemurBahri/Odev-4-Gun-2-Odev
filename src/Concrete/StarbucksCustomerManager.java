package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	 CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save (Customer customer) {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Starbucks musterisi kaydedildi: " + customer.getFistName());
			
		} else {
			System.out.println("Lütfen geçerli bir kişi kaydediniz.");
		}
		
		
		
	}

	

}
