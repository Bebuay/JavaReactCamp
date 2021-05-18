package homework2Day3;

public class Instructor extends User{
	public Instructor(int id ,String firstName,String lastName,String email,int age,String courseName,double instructorSalary) {
		super(id,firstName,lastName,email,age);
		this.courseName=courseName;
		this.instructorSalary=instructorSalary;
	}
	private int coursePassword;
	private String courseName;
	private String courseCode;
	private double instructorSalary;
	
	public int getCoursePassword() {
		return coursePassword;
	}
	public void setCoursePassword(int coursePassword) {
		this.coursePassword=coursePassword;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public String getCourseCode() {
		return courseName.substring(0,4)+getId()+getFirstName().substring(0, 2);
	}
	public double getInstructorSalary() {
		return instructorSalary;
	}
	public void setInstructorSalary(double instructorSalary) {
		this.instructorSalary=instructorSalary;
	}
}

