package videoshop;

public class VideoShop extends Shop implements IQueue {

	@Override
	public void enQueue(String title) {
		list.add(title);
	}

	@Override
	public String deQueue() {
		return list.remove(0);
	}

}
