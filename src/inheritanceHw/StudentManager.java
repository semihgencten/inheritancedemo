package inheritanceHw;

public class StudentManager extends UserManager {
	public void registerCourse(Student student , Course course) {
		System.out.println(student.getFirstName()+" registered to "+ course.getCourseName());
	}
	public void sendHw() {
		System.out.println("Homework sent");
	}
}
