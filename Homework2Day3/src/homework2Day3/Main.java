package homework2Day3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Student1","LastName1","student1@gmail.com",22,"New Learner",100.00,"Istanbul University");
		Student student2 = new Student(2,"Student2","LastName2","student2@gmail.com",20,"Improve Yourself Learner",85.00,"Istanbul Technic University");
		Student[] students = {student1,student2};
		StudentManager studentManager=new StudentManager();
		for(Student student:students) {
			studentManager.signUpProcess(student);
			studentManager.courseComplate(student);
			studentManager.deleteAccount(student);
			studentManager.sendHomeworkViaEmail(student);
		}
		Instructor instructor1 = new Instructor(1,"Instructor1","LastName01","instructor1@gmail.com",34,"JavaReactBootCamp",5000.00);
		Instructor instructor2 = new Instructor(2,"Instructor2","LastName02","instructor2@gmail.com",36,"C#AngularBootCamp",5000.00);
		Instructor[] instructors = {instructor1,instructor2};
		InstructorManager instructorManager = new InstructorManager();
		for(Instructor instructor:instructors) {
			instructorManager.signUpProcess(instructor);
			instructorManager.deleteAccount(instructor);
			instructorManager.newHomeworkNotification(instructor);
			String courseCode =instructor.getCourseCode();
			System.out.println(courseCode);
			
		}
	}

}
