import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1,"Engin","Demiroğ","1985","11111111");
		Customer customer2 = new Customer(2,"Timur","Bahri","1991","22222222");
		
		
		BaseCustomerManager neroManager = new NeroCustomerManager(new CustomerCheckManager());
		neroManager.save(customer);
		neroManager.save(customer2);
		
		
		BaseCustomerManager starbuckManager = new StarbucksCustomerManager(new CustomerCheckManager());
		starbuckManager.save(customer);
		starbuckManager.save(customer2);
		
		System.out.println(customer);
	}

}
