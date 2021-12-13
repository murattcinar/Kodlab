package demoCoffeeBox.Concrate;

import java.rmi.RemoteException;

import demoCoffeeBox.Abstract.BaseCustomerManager;
import demoCoffeeBox.Abstract.CustomerCheckService;
import demoCoffeeBox.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService{
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return false;
	}

}
