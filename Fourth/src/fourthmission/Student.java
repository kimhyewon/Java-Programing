package fourthmission;

import java.util.ArrayList;

public class Student {
	String studentName; 
	int studentId;
	String major;
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(String studentName, int studentId, String major) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.major = major;
	}

	public void addScore(Score score) {
		scoreList.add(score);
	}
	
	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
