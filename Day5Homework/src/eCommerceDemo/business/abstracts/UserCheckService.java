package eCommerceDemo.business.abstracts;

public interface UserCheckService {

	boolean checkPassword(String password);
	boolean checkEmailFormat(String emailAddress);
	boolean checkIfEmailUsedBefore(String emailAddress);
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	
}
