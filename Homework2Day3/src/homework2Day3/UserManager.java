package homework2Day3;

public class UserManager {
	public void signUpProcess(User user) {
		System.out.println(user.getFirstName()+"'s sign up process completed successfully.");
	}
	public void deleteAccount(User user) {
		System.out.println(user.getFirstName()+"'s account delete successfully");
	}
}
