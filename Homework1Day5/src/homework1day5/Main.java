package homework1day5;


import homework1day5.business.abstracts.UserService;
import homework1day5.business.concretes.UserManager;
import homework1day5.core.concretes.EmailValidationManager;
import homework1day5.core.concretes.GoogleManagerAdapter;
import homework1day5.core.concretes.LoginValidationManager;
import homework1day5.dataAccess.concretes.HibernateUserDao;
import homework1day5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Engin","Demiroð","exampleEmail@hotmail.com","29.10.1923");
		UserService userService= new UserManager(new EmailValidationManager(),new LoginValidationManager(),new HibernateUserDao());
		userService.register(user1);
		userService.delete(user1);
		
		UserService userService2= new UserManager(new EmailValidationManager(),new GoogleManagerAdapter(),new HibernateUserDao());
		
		userService2.register(user1);
	}

}
