package demoCoffeeBox.Abstract;

import java.rmi.RemoteException;

import demoCoffeeBox.Entities.Customer;

public interface CustomerService {
	
	void save(Customer customer) throws NumberFormatException, RemoteException;
}
