package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.UserCheckService;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkPassword(String password) {
		return(password.length() >= 6);
	}

	@Override
	public boolean checkEmailFormat(String emailAddress) {
		final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailAddress);
        return matcher.find();
	}

	@Override
	public boolean checkIfEmailUsedBefore(String emailAddress) {
		return true;
	}

	@Override
	public boolean checkFirstName(String firstName) {
		return(firstName.length() >= 2);
	}

	@Override
	public boolean checkLastName(String lastName) {
		// TODO Auto-generated method stub
		return (lastName.length() >= 2);
	}

}
