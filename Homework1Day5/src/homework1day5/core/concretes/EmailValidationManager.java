package homework1day5.core.concretes;

import homework1day5.core.abstracts.EmailValidationService;
import homework1day5.entities.concretes.User;

public class EmailValidationManager implements EmailValidationService {

	@Override
	public void validationMail(User user) {
		System.out.println("Verification email send to "+ user.getEmail());
		
	}

}
