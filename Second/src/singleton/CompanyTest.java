package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company c1 = Company.getInstance();	//이렇게 하면 company 객체를 얻을 수 있다.
		System.out.println(c1);
		
		Company c2 = Company.getInstance();	//이렇게 하면 company 객체를 얻을 수 있다.
		System.out.println(c2);
		
		Calendar calendar = Calendar.getInstance();
	}

}
