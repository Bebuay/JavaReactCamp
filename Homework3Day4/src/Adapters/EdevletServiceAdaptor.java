package Adapters;

import Abstract.CheckGamerService;
import Entities.Gamer;

public class EdevletServiceAdaptor implements CheckGamerService{

	@Override
	public boolean checkRealPerson(Gamer gamer) {
	ExampleService client = new ExampleService(); //Simulation
		return client.TCKimlikDogrula(gamer.getNationalityId(),gamer.getFirstName(),gamer.getLastName());
		
	}

}
