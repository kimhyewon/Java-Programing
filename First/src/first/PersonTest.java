package first;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person(40, "james", true, 3);
		
		System.out.println("나이 : " +person.getAge());
		System.out.println("이름 : " + person.getName());
		System.out.println("결혼 여부 : " + person.getIsMarried());
		System.out.println("자녀 수 : " + person.getNumOfChild());
		
	}

}
