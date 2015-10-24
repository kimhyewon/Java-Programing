package subclassing;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee("홍길동");
//		e.name = "홍길동";
		
		System.out.println(e.getDetail());
		
		Manager m = new Manager("이순신");
		System.out.println(m.getDetail());
		
		Employee me = new Manager("이승기");
		me.getDetail(); //maneger 거가 불린다. 원래는 타입에 맞게 불리니까 employee께 불려야 되는데 왜 이럴까? 자바는 모든 함수가 가상함수다. 
	}

}
