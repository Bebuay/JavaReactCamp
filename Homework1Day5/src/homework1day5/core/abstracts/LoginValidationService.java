package homework1day5.core.abstracts;

import homework1day5.entities.concretes.User;

public interface LoginValidationService {
	boolean isValid(User user);
}
