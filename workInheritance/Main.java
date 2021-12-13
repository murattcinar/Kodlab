package workInheritance;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Ahmet");
		student.setLastName("Kaya");
		student.setClassRoom("12/A");
		student.setSchoolNumber("2043");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Ayşe");
		instructor.setLastName("Şen");
		instructor.setLesson("Matemetik");
		
		
		
		UserManager userManager = new UserManager();
	//	userManager.add(instructor);
	//	userManager.add(student);
		
		User[] users = {student, instructor};
		userManager.addMultiple(users);
	}

}
