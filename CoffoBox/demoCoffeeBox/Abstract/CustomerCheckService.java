package demoCoffeeBox.Abstract;

import java.rmi.RemoteException;

import demoCoffeeBox.Entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
