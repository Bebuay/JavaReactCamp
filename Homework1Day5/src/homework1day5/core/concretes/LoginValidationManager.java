package homework1day5.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import homework1day5.core.abstracts.LoginValidationService;
import homework1day5.entities.concretes.User;

public class LoginValidationManager implements LoginValidationService{
	
	public boolean validPassword(String password) {
		if(password==null || password.length()<6) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean validEmail(String email) {
		String regex =  "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher =pattern.matcher(email);
		if(email== null) {
			return false;
		}
		else {
			return matcher.find();
		}
		
	}
	
	public boolean validName(String firstName,String lastName) {
		
		if((firstName ==null|| firstName.length()<2)||(lastName==null||lastName.length()<2)) {
			return false;
		}
		for(char letter :firstName.toCharArray()) {
			if(Character.isDigit(letter)) {
				return false;
			}
		}
		for(char letter :lastName.toCharArray()) {
			if(Character.isDigit(letter)) {
				return false;
			}
		}
		
		return true;
	}
	
	
	@Override
	public boolean isValid(User user) {
		if(!validEmail(user.getEmail())) {
			System.out.println("Please check your email format and try again.");
			return false;
		}
		if(!validName(user.getFirstName(),user.getLastName())) {
			System.out.println("Please check your first name and last name.At least two character and shouldn't include number");
			return false;
		}
		if(!validPassword(user.getPassword())) {
			System.out.println("At least six character");
			return false;
		}
		return true;
	}

}
