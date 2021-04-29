package inheritanceHw;

public class Main {

	public static void main(String[] args) {
		
		
		Instructor engindemirog =new Instructor();
		
		Course java =new Course(1, "java", engindemirog);
		
		
		UserManager userManager =new UserManager();
		userManager.register(new Student(1,"semih", "gencten", "semihgencten@gmail.com","123", java, 1));
		
		
		engindemirog.setNumberOfStudents(3000);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.updateNumberOfStudents(engindemirog, 1000);
		System.out.println(engindemirog.getNumberOfStudents());
		
		
		Student ihsan =new Student(2,"ihsan", "anar", "ihsananar@gmail.com","456", java, 1);
		StudentManager studentManager=new StudentManager();
		studentManager.registerCourse(ihsan, java);
		studentManager.deleteAccount(ihsan);
		

	}

}
