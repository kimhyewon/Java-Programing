package first;

public class Person {
	private int age;
	private String name;
	private boolean isMarried;
	private int numOfChild;
	
	public Person(int age, String name, boolean isMarried, int numOfChild) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.numOfChild = numOfChild;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getIsMarried() {
		return isMarried;
	}
	
	public int getNumOfChild() {
		return numOfChild;
	}
}
