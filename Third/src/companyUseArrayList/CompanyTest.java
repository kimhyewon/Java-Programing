package companyUseArrayList;

public class CompanyTest {

	public static void main(String[] args) {
		Company company = Company.getInstance();
		
		company.addEmployee(new Manager("Tomas", "personal"));
		company.addEmployee(new Manager("Edward", "Finance"));
		company.addEmployee(new Secretary("Lee", "James"));
		
		Information info = new Information();
		info.getinfo();
	}

}
