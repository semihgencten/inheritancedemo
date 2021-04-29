package inheritanceHw;

public class InstructorManager extends UserManager {
	
	public void updateNumberOfStudents(Instructor instructor, int newStudentsNumber) {
		instructor.setNumberOfStudents(instructor.getNumberOfStudents()+ newStudentsNumber);
		System.out.println("Student number updated");
		
	}
	
}
