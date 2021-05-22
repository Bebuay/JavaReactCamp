package Concrates;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("The game named "+ game.getGameName()+" added to database.");
	}

	@Override
	public void update(Game game) {
		System.out.println("The game named "+game.getGameName()+" updated.");
	}

	@Override
	public void delete(Game game) {
		System.out.println("The game named "+ game.getGameName()+" deleted.");
	}

}
