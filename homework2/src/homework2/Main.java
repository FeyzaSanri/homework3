package homework2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setEmail("engindemiroğ@gmail.com");
        instructor.setPassword("456871");
        instructor.setPhoneNumber("5558963142");
        instructor.setBranch("Java");
        
        Student student = new Student();
        student.setId(6);
        student.setFirstName("Feyza");
        student.setLastName("Sanrı");
        student.setEmail("feyzasanriii@gmail.com");
        student.setPassword("232614");
        student.setParentNumber("5466301520");
        student.setStudentNumber("145");
        student.setElectiveLesson("C#");
        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.delete(instructor);
        instructorManager.givePoints(instructor);
        instructorManager.selectClass(instructor);
        
        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.delete(student);
        studentManager.addLesson(student);
        studentManager.deleteLesson(student);
        
	}

}
