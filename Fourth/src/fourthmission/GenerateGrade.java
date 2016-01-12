package fourthmission;

import java.util.ArrayList;

public class GenerateGrade {
	School shool = School.getInstance();
	
	public void printGrade() {
		printAttribute();
		
		ArrayList<Student> studentList = shool.getStudentList();
		
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			
			System.out.print("  "+student.getStudentName()+"  ");
			System.out.print("  "+student.getStudentId()+"  ");
			System.out.print("  "+student.getMajor()+"  ");
			
			ArrayList<Score> scoreList = student.getScoreList();
			
			for(int j=0; j<scoreList.size(); j++) {
				Score score = scoreList.get(j);
				
				if(student.getMajor() == score.getSubject()) {
					MajorScoreStrategy mStrategy = new MajorScoreStrategy();
					System.out.print("    "+mStrategy.calcScore(score.getScore())+"    ");
				}
				else {
					NonMajorScoreStrategy nStrategy = new NonMajorScoreStrategy();
					System.out.print("    "+nStrategy.calcScore(score.getScore())+"    ");
				}
			}
			System.out.println();
		}
		
	}

	private void printAttribute() {
		System.out.print("   이름   ");
		System.out.print("   학번   ");
		System.out.print("   학과   ");
		System.out.print("  수학   ");
		System.out.print("  영어   ");
		System.out.println();
	}

}
