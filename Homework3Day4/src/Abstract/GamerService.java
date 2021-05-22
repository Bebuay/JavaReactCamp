package Abstract;

import Entities.Gamer;

public interface GamerService {
	void signUp(Gamer gamer);
	void updateData(Gamer gamer);
	void deleteAccount(Gamer gamer);
}
