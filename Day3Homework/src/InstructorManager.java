
public class InstructorManager extends UserManager{

	public InstructorManager(BaseLogIn login) {
		super(login);
	}
	
	public void openNewCourse(Instructor instructor, String course) {
		System.out.println(instructor.getFullName() + " has opened up a new course called "+ course);
		instructor.getCoursesTaught().add(course);
	}
	
	public void listTaughtCourses(Instructor instructor) {
		System.out.println("The courses " + instructor.getFullName() + " is teaching listed below: ");
		for (String course : instructor.getCoursesTaught()) {
			System.out.println(course);
		}
	}
	
}
