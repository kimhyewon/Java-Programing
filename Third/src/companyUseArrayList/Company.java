package companyUseArrayList;

import java.util.ArrayList;

public class Company {
	private static Company instance = new Company();
	ArrayList<Employee> eList = new ArrayList<Employee>();
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	private Company(){};
	
	public void addEmployee(Employee e){
		eList.add(e);
	}
	
	public ArrayList<Employee> getList(){
		return eList;
	}
}
