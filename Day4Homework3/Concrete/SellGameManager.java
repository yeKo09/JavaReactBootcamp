
public class SellGameManager implements SellGameService{

	@Override
	public void sellGame(Gamer gamer, Game game, Campaign campaign) {
		double price = game.getUnitPrice() - (game.getUnitPrice() * campaign.getCampaignDiscount() / 100);
		
		System.out.println(game.getGameName() + " adl� oyun " + gamer.getFirstName() +
				" " + gamer.getLastName() + " adl� ki�iye " + campaign.getCampaignName() + " isimli kampanya "+
				"kapsam�nda y�zde " + campaign.getCampaignDiscount() + " indirim oran� uygulanarak "+
				price + " TL'ye sat�ld�.");
		System.out.println("(�ndirimden �nceki fiyat : " + game.getUnitPrice() + " TL)");
	}

}
