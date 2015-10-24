package subclassing;

public class Manager extends Employee {
	public String department;
	
	public Manager(String name) {
		super(name);
		System.out.println("Manager()");
	}
	
	public void test() {
		name = "aaa";
		salary = 100000000;
	}
	
	public String getDetail() {
//		return name + "," + sabun + "," + salary + "," + department; 아래와 같다.
		return super.getDetail() + department;
	}
}
