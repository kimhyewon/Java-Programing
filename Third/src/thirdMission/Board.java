package thirdMission;

public class Board {
	public static void main(String[] args) {
		Player player = new Player();
		
		System.out.println("======== level1 start ========");
		player.attack();
		System.out.println("======== level1 end ==========");
		System.out.println();
		
		player.upgradeLevel(GameLevel2.getInstance());
		System.out.println("======== level2 start ========");
		player.attack();
		System.out.println("======== level2 end ==========");
		System.out.println();
		
		player.upgradeLevel(GameLevel3.getInstance());
		System.out.println("======== level3 start ========");
		player.attack();
		System.out.println("======== level3 end ==========");
	}
}
