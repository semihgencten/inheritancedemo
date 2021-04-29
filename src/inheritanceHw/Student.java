package inheritanceHw;

public class Student extends User{
	private Course courseTaken;
	private int numberOfTakenCourses;
	
	public Student(int id, String firstName, String lastName, String email, String password, Course courseTaken,
			int numberOfTakenCourses) {
		super(id, firstName, lastName, email, password);
		this.courseTaken = courseTaken;
		this.numberOfTakenCourses = numberOfTakenCourses;
	}
	public Student() {
		
	}

	

	public String getCourseTaken() {
		return courseTaken.getCourseName();
	}



	public void setCourseTaken(Course courseTaken) {
		this.courseTaken = courseTaken;
	}



	public int getNumberOfTakenCourses() {
		return numberOfTakenCourses;
	}

	public void setNumberOfTakenCourses(int numberOfTakenCourses) {
		this.numberOfTakenCourses = numberOfTakenCourses;
	}
}
