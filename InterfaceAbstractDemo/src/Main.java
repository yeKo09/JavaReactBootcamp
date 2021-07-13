import java.rmi.RemoteException;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		LocalDate date = LocalDate.of(1985, 1, 6);
		customerManager.save(new Customer(1,"Engin","Demiroð",date,"28861499108"));
		
		
	}

}
