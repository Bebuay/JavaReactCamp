package homework2Day3;

public class Student extends User{
	public Student(int id,String firstName,String lastName,String email,int age,String description, double courseProgression, String schoolName) {
		super(id,firstName,lastName,email,age);
		this.description=description;
		this.courseProgression=courseProgression;
		this.schoolName=schoolName;
	}
	
	private String description;
	private double courseProgression;
	private String schoolName;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCourseProgression() {
		return courseProgression;
	}
	public void setCourseProgression(double courseProgression) {
		this.courseProgression=courseProgression;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName=schoolName;
	}
}
