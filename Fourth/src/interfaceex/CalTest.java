package interfaceex;

public class CalTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		ICalc calc = new Calulator();
		System.out.println(calc.add(num1, num2));
	}

}
