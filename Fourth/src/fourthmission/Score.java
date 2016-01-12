package fourthmission;

public class Score {
	int studentId;
	String subject;
	int score;
	
	public Score(int studentId, String subject, int score) {
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
