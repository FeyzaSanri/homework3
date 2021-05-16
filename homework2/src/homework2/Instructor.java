package homework2;

public class Instructor extends User {
       
      private String branch;
      private String address;
      private String phoneNumber;
      
      public Instructor() {
    	  
      }
      
      public Instructor(String branch , String address , String phoneNumber) {
    	  this.branch=branch;
    	  this.address=address;
    	  this.phoneNumber=phoneNumber;
      }

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
      
      
       
}
