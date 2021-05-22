package Concrates;

import Abstract.CheckGamerService;
import Entities.Gamer;

public class CheckGamerManager implements CheckGamerService{

	@Override
	public boolean checkRealPerson(Gamer gamers) {
		return true;
	}

}
