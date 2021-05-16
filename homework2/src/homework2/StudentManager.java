package homework2;

public class StudentManager extends UserManager {
	
	public void addLesson(Student student) {
	   	 System.out.println(student.getFirstName() + " "+ 
	    student.getLastName() + " " + " successfully added. ");
	    }
	
	public void deleteLesson(Student student) {
	   	 System.out.println(student.getFirstName() + " "+ 
	    student.getLastName() + " " + " successfully deleted. ");
	    }
}
