package fourthmission;

public class MajorScoreStrategy implements IScoreStrategy {

	@Override
	public char calcScore(int score) {
		char grade;
		
		if (score >= 95 && score <= 100 ){
			grade = 'S';
		} 
		else if (score >= 90 && score < 95){
			grade = 'A';
		} 
		else if (score >= 80 && score < 90){
			grade = 'B';
		} 
		else if (score >= 70 && score < 80){
			grade = 'C';
		} 
		else if (score >= 60 && score < 70){
			grade = 'D';
		} 
		else {
			grade = 'F';
		} 
		return grade;
	}
}
