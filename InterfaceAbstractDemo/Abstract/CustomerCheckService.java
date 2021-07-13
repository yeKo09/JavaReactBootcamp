import java.rmi.RemoteException;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer)  throws NumberFormatException, RemoteException;
	
}
