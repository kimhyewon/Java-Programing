package person;

public class Person {
	public int age;
	public String name;
	
	Person(){
		this(0, "무명씨");
	}
	
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	Person getPerson() {
		return this;
	}
}
