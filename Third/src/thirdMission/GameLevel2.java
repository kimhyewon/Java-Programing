package thirdMission;

public class GameLevel2 extends GameLevel {
	private static GameLevel2 instance = new GameLevel2();

	private GameLevel2(){};

	public static GameLevel2 getInstance(){
		if(instance == null) {
			instance = new GameLevel2();
		}
		return instance;
	}

	@Override
	public void simpleAttack() {
		System.out.println("메롱~ 메롱~");
	}

	@Override
	public void turnAttack() {
		System.out.println("돌려차기 쓍~~~");
	}

	@Override
	public void flyingAttack() {
		System.out.println("이건 못하지롱");
	}
}
