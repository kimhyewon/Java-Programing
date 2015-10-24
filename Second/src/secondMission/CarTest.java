package secondMission;

public class CarTest {
	
	public static void main(String[] args) {
	
		CarCompany company = CarCompany.getInstance();
		Sonata sonata = new Sonata();
		Grandeur grandeur = new Grandeur();
		Genesis genesis = new Genesis();
	
		company.createCar(sonata);
		company.createCar(sonata);
		company.createCar(sonata);
		company.createCar(grandeur);
		company.createCar(grandeur);
		company.createCar(genesis);
		
		CalculateCar calc = new CalculateCar();
		int addResult = calc.calculate();
		System.out.println("자동차 회사가 가지고 있는 차의 가격의 합 : " + addResult);
	}
}
