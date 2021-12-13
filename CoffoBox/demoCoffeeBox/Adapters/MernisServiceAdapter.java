package demoCoffeeBox.Adapters;

import java.rmi.RemoteException;

import demoCoffeeBox.Abstract.CustomerCheckService;
import demoCoffeeBox.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	
	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		if(result == true)
		{
			System.out.println("Basarili");
			return true;
			
		}else {
			System.out.println("Basarisiz");
			return false;
		}
	}
}
