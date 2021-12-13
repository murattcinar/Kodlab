package demoCoffeeBox;

import java.rmi.RemoteException;

import demoCoffeeBox.Abstract.BaseCustomerManager;
import demoCoffeeBox.Adapters.MernisServiceAdapter;
import demoCoffeeBox.Concrate.StarbucksCustomerManager;
import demoCoffeeBox.Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(new Customer(1, "Murat", "Çınar", 1978, "12345678900"));
	}

}
