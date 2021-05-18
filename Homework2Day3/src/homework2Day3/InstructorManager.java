package homework2Day3;

public class InstructorManager extends UserManager{
	@Override
	public void signUpProcess(User user) {
		System.out.println(user.getFirstName()+user.getId()+" is your first password , you can change it later.");
	}
	public void newHomeworkNotification(Instructor instructor) {
		System.out.println(instructor.getCourseName()+ "'s new homework upload your system.");
	}
}
