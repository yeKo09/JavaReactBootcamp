
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demirog");
		
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demirog");
		
		Course[] courses = {
				course1,
				course2
		};
		
		for (Course course : courses) {
			System.out.println(course.name + " is instructed by " + course.instructor);
		}
		
		Student student1 = new Student(1,"Yekta B�y�kkaya", "yekob33@gmail.com", "123");
		
		StudentManager studentManager1 = new StudentManager();
		
		studentManager1.enrollCourse(student1, course1);
		
		studentManager1.changePassword(student1);
		
		
	}

}

