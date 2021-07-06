
public class StudentManager {

	public void enrollCourse(Student student, Course course) {
		System.out.println(student.fullName + " has enrolled to " + course.name + " by " + course.instructor);
	}
	
	public void changePassword(Student student) {
		System.out.println(student.fullName + " has changed password.");
	}
	
}