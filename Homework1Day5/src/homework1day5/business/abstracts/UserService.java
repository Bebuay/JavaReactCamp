package homework1day5.business.abstracts;

import homework1day5.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	void register(User user);
	void login(String email,String password);
}
