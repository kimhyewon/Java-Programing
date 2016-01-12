package fourthmission;

import java.util.ArrayList;

public class School {
	private static School instance = new School();
	
	private School(){};
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public void addStudent(Student student){
		studentList.add(student);
	}
	
	public void addSubject(Subject subject){
		subjectList.add(subject);
	}
	
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	public ArrayList<Subject> getSubjectList(){
		return subjectList;
	}
}
