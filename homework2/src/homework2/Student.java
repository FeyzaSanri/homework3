package homework2;

public class Student extends User{
     private String studentNumber;
     private String parentNumber;
     private String electiveLesson;
     
     public Student() {
    	 
     }
     
    public Student(String studentNumber , String parentNumber , String electiveLesson) {
    	 this.studentNumber= studentNumber;
    	 this.parentNumber=parentNumber;
    	 this.electiveLesson=electiveLesson;
     }

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getParentNumber() {
		return parentNumber;
	}

	public void setParentNumber(String parentNumber) {
		this.parentNumber = parentNumber;
	}

	public String getElectiveLesson() {
		return electiveLesson;
	}

	public void setElectiveLesson(String electiveLesson) {
		this.electiveLesson = electiveLesson;
	}
     
}
