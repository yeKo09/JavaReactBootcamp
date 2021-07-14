package Concrete;

import java.time.LocalDate;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class eDevletCheckManager implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		//E�er 18 ya��ndan k���kse oynayamaz kural�n� getDateofBirth() kullanarak check ettim.
		if(gamer.getNationalityId().length() == 11 && !gamer.getFirstName().isEmpty() && 
				!gamer.getLastName().isEmpty() && gamer.getDateOfBirth().isBefore(LocalDate.of(2003, 7, 14))) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
