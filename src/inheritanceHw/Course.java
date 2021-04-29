package inheritanceHw;

public class Course {
	private int id;
	private String courseName;
	private Instructor instructor;
	
	public Course(int id, String courseName, Instructor instructor) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
}
