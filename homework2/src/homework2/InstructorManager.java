package homework2;

public class InstructorManager extends UserManager {
    
	public void selectClass(Instructor żnstructor) {
   	 System.out.println(żnstructor.getFirstName() + " "+ 
    żnstructor.getLastName() + " " + " successfully selected. ");
    }
	
	public void givePoints(Instructor żnstructor) {
	   	 System.out.println( żnstructor.getFirstName() + " " +
	żnstructor.getLastName() + " " + "Points awarded. ");
	    }
}
