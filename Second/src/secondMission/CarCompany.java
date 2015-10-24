package secondMission;

import java.util.ArrayList;

public class CarCompany {
	private static CarCompany instance = new CarCompany();
	ArrayList<Car> carList = new ArrayList<Car>();
	
	private CarCompany(){};
	
	public static CarCompany getInstance() {
		if(instance == null) {
			instance = new CarCompany();
		}
		return instance;
	}
	
	public void createCar(Car car) {
		carList.add(car);
	}
	
	public ArrayList<Car> getCarList() {
		return carList;
	}
}
