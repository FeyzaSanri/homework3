package homework2;

public class UserManager {
	
     public void add(User user) {
    	 System.out.println(user.getFirstName() + " "+ 
     user.getLastName() + " " + " is added . ");
     }
     
     public void delete(User user) {
    	 System.out.println(user.getFirstName() + " "+ 
     user.getLastName() + " " + " is deleted . ");
     }
     
     
}
