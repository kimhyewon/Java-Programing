package secondMission;

import java.util.ArrayList;

public class CalculateCar {
	CarCompany company = CarCompany.getInstance(); 
	ArrayList<Car> carList = company.getCarList();
	
	public int calculate() {
		int addResult = 0;
		
		for(int i=0; i<carList.size(); i++) {
			addResult += carList.get(i).getPrice();
		}
		
		return addResult;
	}
}
