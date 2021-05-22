package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameSaleService {
	void sale(Gamer gamer,Game game);
	void saleWithCampaign(Gamer gamer,Game game,Campaign campaign);
	void refund(Gamer gamer,Game game);
}
