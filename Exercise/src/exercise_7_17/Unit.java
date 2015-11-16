package exercise_7_17;

abstract class Unit {
	int x;
	int y;
	
	abstract void move(int x, int y);
	void stop(){};
}

class Marine extends Unit {
	int x,y;
	void move(int x, int y){};
	void stop(){}
	void stimPack(){}
}

class Tank extends Unit { 
	int x, y; 
	void move(int x, int y) {}
	void stop(){}
	void changeMode(){}
}

class Dropship extends Unit { 
	int x, y; 
	void move(int x, int y) {}
	void stop(){}
	void load(){} 
	void unload(){}
}