package student;

public class Student {
	public static int serialNo = 201500;
	private int studentNo;
	private String name;
	private String majorNo;
	private String address;
	
	Student() {
		this("이름 없음", "학과 없음", "주소 없음");
	}
	
	Student(String name, String majorNo, String address) {
		this.name = name;
		this.majorNo = majorNo;
		this.address = address;
		this.studentNo = ++serialNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public static int getSrielNo() {
		return serialNo;
	}
	
	public String getName() {
		return name;
	}

	public String getMajorNo() {
		return majorNo;
	}

	public String getAddress() {
		return address;
	}
}
