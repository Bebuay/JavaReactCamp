package homework1day5.core.concretes;

import homework1day5.Google.GoogleManager;
import homework1day5.core.abstracts.LoginValidationService;
import homework1day5.entities.concretes.User;

public class GoogleManagerAdapter implements LoginValidationService{

	@Override
	public boolean isValid(User user) {
		GoogleManager googleManager = new GoogleManager();
		return googleManager.isValid();
	}




}
