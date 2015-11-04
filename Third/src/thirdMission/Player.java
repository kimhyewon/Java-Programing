package thirdMission;

public class Player {
	private GameLevel level = GameLevel1.getInstance();

	public void upgradeLevel(GameLevel level){
		this.level = level;
	}

	public GameLevel getGameLevel(){
		return level;
	}

	public void attack(){
		level.play();
	}
}
