package ship;

import junit.framework.TestCase;

public class SlippingMain extends TestCase {
	public void testShipping(){
		
		Company company = Company.getInstance();
		
		
		GenerateReport report = new GenerateReport();
		assertEquals( 80 ,report.generateFuelNeeds());
	}
}
