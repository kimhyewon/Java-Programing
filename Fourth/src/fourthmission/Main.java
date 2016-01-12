package fourthmission;

public class Main {
	static Subject math;
	static Subject english;
		
	public static void main(String[] args) {
		School school = School.getInstance();
		
		Student st1 = new Student("이승기", 141213, "수학");
		Student st2 = new Student("김수현", 141518, "영어");
		Student st3 = new Student("주 원", 141230, "수학");
		Student st4 = new Student("김우빈", 141255, "수학");
		Student st5 = new Student("이민호", 141590, "영어");

		school.addStudent(st1);
		school.addStudent(st2);
		school.addStudent(st3);
		school.addStudent(st4);
		school.addStudent(st5);
		
		math = new Subject("수학");
		english = new Subject("영어");
		
		school.addSubject(math);
		school.addSubject(english);
		
		addScore(st1, 92, 20);
		addScore(st2, 90, 100);
		addScore(st3, 76, 60);
		addScore(st4, 85, 89);
		addScore(st5, 90, 95);
		
		GenerateGrade grade = new GenerateGrade();
		grade.printGrade();
		
	}

	public static void addScore(Student student, int mathScore, int englishScore) {
		Score score1 = new Score(student.getStudentId(), math.getSubjectName(), mathScore);
		Score score2 = new Score(student.getStudentId(), english.getSubjectName(), englishScore);
		
		student.addScore(score1);
		student.addScore(score2);
	}
}
