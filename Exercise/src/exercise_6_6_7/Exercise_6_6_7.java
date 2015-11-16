package exercise_6_6_7;

class MyPoint {
	int x; 
	int y;
	
	MyPoint(int x, int y) { 
		this.x = x;
		this.y = y; 
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1) * (x-x1) + (y-y1) * (y-y1));
	}
}

public class Exercise_6_6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);
	
		System.out.println(p.getDistance(2,2));
	}
}
