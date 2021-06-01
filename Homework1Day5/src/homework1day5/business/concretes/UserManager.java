package homework1day5.business.concretes;

import homework1day5.business.abstracts.UserService;
import homework1day5.core.abstracts.EmailValidationService;
import homework1day5.core.abstracts.LoginValidationService;
import homework1day5.dataAccess.abstracts.DataAccessService;
import homework1day5.entities.concretes.User;

public class UserManager implements UserService {
	private DataAccessService dataAccessService;
	
	public UserManager(DataAccessService dataAccessService) {
		super();
		this.dataAccessService= dataAccessService;
	}

	@Override
	public void add(User user) {
		dataAccessService.addUser(user);
		
	}

	@Override
	public void delete(User user) {
		dataAccessService.deleteUser(user);
		
	}

	@Override
	public void update(User user) {
		dataAccessService.updateUser(user);
		
	}
	
	private EmailValidationService emailValidationService;
	private LoginValidationService loginValidationService;
	
	public UserManager(EmailValidationService emailValidationService,
	LoginValidationService loginValidationService,DataAccessService dataAccessService) {
		super();
		this.dataAccessService=dataAccessService;
		this.emailValidationService=emailValidationService;
		this.loginValidationService=loginValidationService;
	}

	@Override
	public void register(User user) {
		if(!loginValidationService.isValid(user)) {
			System.out.println("Failed to register.Please check your information.");
		}
		else if(!dataAccessService.checkEmail(user)) {
			System.out.println("This email '"+user.getEmail()+"' in used.Try another email address");
		}
		else {
			dataAccessService.addUser(user);
			emailValidationService.validationMail(user);
		}
		
	}

	@Override
	public void login(String email, String password) {
		if(!dataAccessService.checkForLogin(email, password)) {
			System.out.println("Access Denied. Please check your information.");
		}
		else {
			System.out.println("Access Allowed");
		}
		
	}

}
