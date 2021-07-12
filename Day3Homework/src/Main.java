
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin Demiroð", "eg@gmail.com", "demirog");
		
		InstructorManager instructorManager1 = new InstructorManager(new InstructorLogIn());
		
		instructorManager1.loginToSystem(instructor1);
		
		instructorManager1.openNewCourse(instructor1, "JAVA + REACT");
		
		instructorManager1.listTaughtCourses(instructor1);
		
		System.out.println("***********");
		
		
		Student student1 = new Student(1, "Yekta Büyükkaya", "homework3@gmail.com", "homework3");
		
		StudentManager studentManager1 = new StudentManager(new StudentLogIn());
		
		studentManager1.loginToSystem(student1);
		
		studentManager1.enrollCourse(student1, "JAVA + REACT");
		
		studentManager1.listEnrolledCourses(student1);
		
		
		
		
		

	}

}
