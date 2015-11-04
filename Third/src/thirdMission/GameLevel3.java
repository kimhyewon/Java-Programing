package thirdMission;

public class GameLevel3 extends GameLevel {
	private static GameLevel3 instance = new GameLevel3();

	private GameLevel3(){};

	public static GameLevel3 getInstance(){
		if(instance == null) {
			instance = new GameLevel3();
		}
		return instance;
	}

	@Override
	public void simpleAttack() {
		System.out.println("메롱~ 메롱~ 메롱");
	}

	@Override
	public void turnAttack() {
		System.out.println("뒤돌려차기 앞돌려차기");
	}

	@Override
	public void flyingAttack() {
		System.out.println("날라차기 휙~~~");
	}
}
