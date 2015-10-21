package firstMission;


public class BirthDayTest {
	public static void main(String[] args) {
		BirthDay d1 = new BirthDay(29, 2, 2000);
		printResult(d1.checkValidate());
		
		BirthDay d2 = new BirthDay(10, 7, 2014);
		printResult(d2.checkValidate());
		
		BirthDay d3 = new BirthDay(29, 2, 2100);
		printResult(d3.checkValidate());
	}
	
	private static void printResult(boolean result) {
		if(result) {
			System.out.println("유효함");
		}
		else {
			System.out.println("유효하지 않음");
		}
	}

}
