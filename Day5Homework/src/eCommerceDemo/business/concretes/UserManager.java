package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.EmailValidationService;
import eCommerceDemo.business.abstracts.UserCheckService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{

	private UserCheckService userCheckService;
	private EmailValidationService emailValidationService;
	private UserDao userDao;
	
	
	public UserManager(UserCheckService userCheckService, EmailValidationService emailValidationService,UserDao userDao) {
		this.userCheckService = userCheckService;
		this.emailValidationService = emailValidationService;
		this.userDao = userDao;
	}

	@Override
	public void signUp(User user) {
		
		if(this.userCheckService.checkFirstName(user.getFirstName()) && this.userCheckService.checkLastName(user.getLastName()) &&
				this.userCheckService.checkIfEmailUsedBefore(user.getEmailAddress()) &&
				this.userCheckService.checkEmailFormat(user.getEmailAddress()) &&
				this.userCheckService.checkPassword(user.getPassword())) {
			System.out.println("Sn. "+ user.getFirstName() + " " + user.getLastName() + 
					" kaydolman�z�n ilk ad�m� ba�ar�l�. G�nderilen do�rulama linkine t�klayarak �yeli�inizi tamamlay�n�z.");
			this.emailValidationService.sendValidationEmail(user);
			if(this.emailValidationService.isVerified(user)) {
				System.out.println(user.getFirstName() + " " + user.getLastName() +
						" adl� kullan�c� ba�ar�yla kaydoldu.");
				this.userDao.add(user);
			}
		}else {
			System.out.println("Kaydolma ba�ar�s�z. Bilgilerinizi tekrar kontrol edin.");
		}
		
	}

	@Override
	public void signIn(User user) {
		
		//User newUser = this.userDao.get(1);
		//Sim�le etti�im i�in yukar�daki gibi yazmak istemedim.Sim�le etmesem y�ksek ihtimalle yukar�daki gibi olurdu.
		//ve user de�i�keninin email adresi ile newUser de�i�keninin email adresini kar��la�t�r�rd�m.
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ba�ar�yla giri� yapt�.");
		
		
	}

}
