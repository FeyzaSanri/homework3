package homework2;

public class InstructorManager extends UserManager {
    
	public void selectClass(Instructor ýnstructor) {
   	 System.out.println(ýnstructor.getFirstName() + " "+ 
    ýnstructor.getLastName() + " " + " successfully selected. ");
    }
	
	public void givePoints(Instructor ýnstructor) {
	   	 System.out.println( ýnstructor.getFirstName() + " " +
	ýnstructor.getLastName() + " " + "Points awarded. ");
	    }
}
