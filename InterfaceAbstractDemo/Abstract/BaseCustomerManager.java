import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {

		System.out.println("Saved to DB by " + customer.getFirstName());
		
	}

}
