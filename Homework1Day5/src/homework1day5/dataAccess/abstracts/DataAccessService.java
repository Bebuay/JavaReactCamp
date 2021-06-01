package homework1day5.dataAccess.abstracts;

import homework1day5.entities.concretes.User;

public interface DataAccessService {
	void addUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	boolean checkEmail(User user);
	boolean checkForLogin(String email,String password);
}
