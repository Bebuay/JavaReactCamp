package main;

public class Main {
	public static void main(String[] args) {
		Course javaCourse = new Course(1,"Java&React","Yazılımcı Yetiştirme Kampı","16 Days");
		Course cSharpCourse = new Course (2,"C#&Angular","Sıfırdan Zirveye Yazılımcı Kursu","21 Days");
		CourseManager courseManager = new CourseManager();
		
		Course[] courses = {javaCourse,cSharpCourse};
		for (Course course:courses) {
			courseManager.singUpCourse(course);
			courseManager.rollCall(course);
		}
	}
}
