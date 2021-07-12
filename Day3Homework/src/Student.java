import java.util.ArrayList;


public class Student extends User{

	private ArrayList<String> enrolledCourses;
	
	public Student(int id, String fullName, String emailAddress, String password) {
		super(id, fullName, emailAddress, password);
		this.enrolledCourses = new ArrayList<String>();
	}

	public ArrayList<String> getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(ArrayList<String> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	
	
	
}
