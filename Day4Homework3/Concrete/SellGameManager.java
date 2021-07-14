
public class SellGameManager implements SellGameService{

	@Override
	public void sellGame(Gamer gamer, Game game, Campaign campaign) {
		double price = game.getUnitPrice() - (game.getUnitPrice() * campaign.getCampaignDiscount() / 100);
		
		System.out.println(game.getGameName() + " adlý oyun " + gamer.getFirstName() +
				" " + gamer.getLastName() + " adlý kiþiye " + campaign.getCampaignName() + " isimli kampanya "+
				"kapsamýnda yüzde " + campaign.getCampaignDiscount() + " indirim oraný uygulanarak "+
				price + " TL'ye satýldý.");
		System.out.println("(Ýndirimden önceki fiyat : " + game.getUnitPrice() + " TL)");
	}

}
