package homework2;

public class InstructorManager extends UserManager {
    
	public void selectClass(Instructor �nstructor) {
   	 System.out.println(�nstructor.getFirstName() + " "+ 
    �nstructor.getLastName() + " " + " successfully selected. ");
    }
	
	public void givePoints(Instructor �nstructor) {
	   	 System.out.println( �nstructor.getFirstName() + " " +
	�nstructor.getLastName() + " " + "Points awarded. ");
	    }
}
