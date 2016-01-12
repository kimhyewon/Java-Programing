package videoshop;

public class VideoTest {

	public static void main(String[] args) {
		IQueue vShop = new VideoShop();
		vShop.enQueue("검은사제들1");
		vShop.enQueue("검은사제들2");
		vShop.enQueue("검은사제들3");
		
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
	}

}
