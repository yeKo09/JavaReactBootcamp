
public class StudentManager extends UserManager {

	public StudentManager(BaseLogIn login) {
		super(login);
	}
	
	public void enrollCourse(Student student,String course) {
		System.out.println(student.getFullName() + " has enrolled to " + course);
		student.getEnrolledCourses().add(course);
	}
	
	public void listEnrolledCourses(Student student) {
		System.out.println("The courses " + student.getFullName() + " has enrolled listed below: ");
		for (String course : student.getEnrolledCourses()) {
			System.out.println(course);
		}
	}
	
}
