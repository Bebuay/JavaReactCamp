package Concrates;

import Abstract.CheckGamerService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	private CheckGamerService checkGamerService;
	
	public GamerManager(CheckGamerService checkGamerService) {
		this.checkGamerService=checkGamerService;
	}

	@Override
	public void signUp(Gamer gamer) {
		if(checkGamerService.checkRealPerson(gamer)) {
		System.out.println("The player named "+ gamer.getFirstName()+" has been signed up.");
		}
		else {
			System.out.println("Not a valid person.");
		}
	}

	@Override
	public void updateData(Gamer gamer) {
		System.out.println("The player named "+gamer.getFirstName()+" has been updated.");
	}

	@Override
	public void deleteAccount(Gamer gamer) {
		System.out.println("The player named "+gamer.getFirstName()+" has been deleted");
	}

}
