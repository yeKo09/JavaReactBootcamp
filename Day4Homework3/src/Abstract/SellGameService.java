package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SellGameService {

	void sellGame(Gamer gamer, Game game, Campaign campaign);
	
}
