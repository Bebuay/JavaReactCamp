package Concrates;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameSaleManager implements GameSaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println("The game named "+game.getGameName()+" sold for "+game.getGamePrice()+" to "+gamer.getFirstName());
	}

	@Override
	public void saleWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		int finalPrice;
		finalPrice  = game.getGamePrice()-((game.getGamePrice()*campaign.getPercentageDiscount())/100);
		System.out.println("The game named "+game.getGameName()+" sold for "+finalPrice+" to "+gamer.getFirstName());
	}

	@Override
	public void refund(Gamer gamer, Game game) {
		System.out.println("The game named "+ game.getGameName()+ " refunded "+" to "+gamer.getFirstName());
		
	}

}
