package first;

public class CalulatorTest {

	public static void main(String[] args) {
		Calulator cal = new Calulator();
		cal.num1 = 10;
		cal.num2 = 2;
		
		System.out.println(cal.add());
		System.out.println(cal.subtraction());
		System.out.println(cal.multiply());
		System.out.println(cal.divide());

	}
}
