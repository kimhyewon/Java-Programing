package person;


public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.name);
		System.out.println(p.age);
		
		Person p2 = p.getPerson();
		System.out.println(p2);
		System.out.println(p);
	}
}
