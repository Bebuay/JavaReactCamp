package main;

public class Main {
	public static void main(String[] args) {
		Course javaCourse = new Course(1,"Java&React","Yaz�l�mc� Yeti�tirme Kamp�","16 Days");
		Course cSharpCourse = new Course (2,"C#&Angular","S�f�rdan Zirveye Yaz�l�mc� Kursu","21 Days");
		CourseManager courseManager = new CourseManager();
		
		Course[] courses = {javaCourse,cSharpCourse};
		for (Course course:courses) {
			courseManager.singUpCourse(course);
			courseManager.rollCall(course);
		}
	}
}
