package first;

public class BirthDayTest {
//2000년 2월 29일 (유효함) 2014 년 7월 10일 (유효함) 2100년 2월 29일 (유효하지 않음)
	public static void main(String[] args) {
		BirthDay d1 = new BirthDay(29, 2, 2000);
		boolean result1 = d1.checkValidate();
		printResult(result1);
		
		BirthDay d2 = new BirthDay(10, 7, 2014);
		boolean result2 = d2.checkValidate();
		printResult(result2);
		
		BirthDay d3 = new BirthDay(29, 2, 2100);
		boolean result3 = d3.checkValidate();
		printResult(result3);
	}
	
	private static void printResult(boolean result) {
		if(result == true) {
			System.out.println("유효함");
		}
		else {
			System.out.println("유효하지 않음");
		}
	}

}