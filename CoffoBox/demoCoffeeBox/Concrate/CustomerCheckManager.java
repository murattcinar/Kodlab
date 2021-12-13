package demoCoffeeBox.Concrate;

import demoCoffeeBox.Abstract.CustomerCheckService;
import demoCoffeeBox.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;	
	}
}
