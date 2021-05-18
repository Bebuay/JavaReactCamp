package homework2Day3;

public class StudentManager extends UserManager{
	public void courseComplate(Student student) {
		if(student.getCourseProgression()==100.00) {
			System.out.println(student.getFirstName()+ student.getLastName()+" complate course successfully.");
		}
		else {
			System.out.println("You should do your tasks first!");
		}
	}
	public void sendHomeworkViaEmail(Student student) {
		System.out.println("from : "+student.getEmail()+"\nto : example@gmail.com \nYour email send successfully.");
	}
}
