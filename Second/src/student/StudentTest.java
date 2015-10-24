package student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("김혜원", "10", "야탑동");
		System.out.println(Student.serialNo);
		
		
		Student s2 = new Student("김깨끔", "20", "홍대");
		System.out.println(s2.getStudentNo());
		
		Student s3 = new Student();
		
	}

}
