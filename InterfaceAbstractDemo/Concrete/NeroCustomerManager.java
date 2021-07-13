import java.rmi.RemoteException;

public class NeroCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException{
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}	
	}
	
}
