package thirdMission;

public class GameLevel1 extends GameLevel {
	private static GameLevel1 instance = new GameLevel1();

	private GameLevel1(){};

	public static GameLevel1 getInstance(){
		if(instance == null) {
			instance = new GameLevel1();
		}
		return instance;
	}

	@Override
	public void simpleAttack() {
		System.out.println("메롱~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("못하지롱");
	}

	@Override
	public void flyingAttack() {
		System.out.println("이것도 못하지롱");
	}
}
