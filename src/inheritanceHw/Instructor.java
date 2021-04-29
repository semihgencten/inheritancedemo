package inheritanceHw;

public class Instructor extends User {
	private Course courseGiven;
	private int numberOfStudents;
	
	public Instructor(int id, String firstName, String lastName, String email, String password, Course courseGiven,
			int numberOfStudents) {
		super(id, firstName, lastName, email, password);
		this.courseGiven = courseGiven;
		this.numberOfStudents = numberOfStudents;
	}
	public Instructor() {
		
	}

	public String getCourseGiven() {
		return courseGiven.getCourseName();
	}

	public void setCourseGiven(Course courseGiven) {
		this.courseGiven = courseGiven;
		System.out.println(courseGiven.getCourseName()+ " eklendi");
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
}
