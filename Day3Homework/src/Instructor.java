import java.util.ArrayList;



public class Instructor extends User{

	private ArrayList<String> coursesTaught;
	
	public Instructor(int id, String fullName, String emailAddress, String password) {
		super(id,fullName,emailAddress,password);
		this.coursesTaught = new ArrayList<String>();
	}

	public ArrayList<String> getCoursesTaught() {
		return coursesTaught;
	}

	public void setCoursesTaught(ArrayList<String> coursesTaught) {
		this.coursesTaught = coursesTaught;
	}
	
	
	
}
