import Adapters.EdevletServiceAdaptor;
import Concrates.CampaignManager;
import Concrates.GameManager;
import Concrates.GameSaleManager;
import Concrates.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer("11111111111",1,"Ayberk","Aldam","example@hotmail.com",20);
		GamerManager gamerManager = new GamerManager(new EdevletServiceAdaptor());
		gamerManager.signUp(gamer1);
		
		
		Game game1 = new Game(1,"The Last Of Us","Ps4 Game",190);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game1);
		gameManager.update(game1);
		
		Campaign campaign1 = new Campaign(1,"Summer Campaign","2021/06/01","2021/06/20",45);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		campaignManager.deleteCampaign(campaign1);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sale(gamer1, game1);
		gameSaleManager.saleWithCampaign(gamer1, game1, campaign1);
		
		
	}

}
