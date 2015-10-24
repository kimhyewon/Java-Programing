package subclassing;

public class Employee {
	public String name;
	public int sabun;
	protected double salary;
	
	public Employee(String name) {
		this(name, 1000.0);
		System.out.println("Employee(String)");
	}
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getDetail() {
		return name + "," + sabun + "," + salary;
	}
}
