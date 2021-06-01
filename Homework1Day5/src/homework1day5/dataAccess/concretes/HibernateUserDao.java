package homework1day5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework1day5.dataAccess.abstracts.DataAccessService;
import homework1day5.entities.concretes.User;

public class HibernateUserDao implements DataAccessService {
	
	List<User> users = new ArrayList<>();

	@Override
	public void addUser(User user) {
		System.out.println("The user named "+ user.getFirstName()+" has been added to database");
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("The user named "+ user.getFirstName()+" has been deleted from database");		
	}

	@Override
	public void updateUser(User user) {
		System.out.println("The user named "+ user.getFirstName()+" has been updated");	
	}

	@Override
	public boolean checkEmail(User user) {
		for(User us :users) {
			if(us.getEmail()==user.getEmail()) {
				return false;
			}
			
		}
		return true;
	}

	@Override
	public boolean checkForLogin(String email,String password) {
		for(User user:users) {
			if(email==user.getEmail()&&user.getPassword()==password) {
				return true;
			}
		}
		return false;
	}

}
