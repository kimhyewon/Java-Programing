package first;

public class DogTest {

	public static void main(String[] args) {

		Dog myDog = new Dog();
		myDog.setName("멍멍이");
		myDog.age = 2;
		
		Dog yourDog = new Dog();
		yourDog.setName("깨끔이");
		yourDog.age = 1;
		
		System.out.println(myDog.getName());
		System.out.println(yourDog.getName());
	}

}
