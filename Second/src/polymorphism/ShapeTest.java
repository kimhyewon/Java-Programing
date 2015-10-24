package polymorphism;

class Shape {
	public void draw() {
		System.out.println("Draw Shape");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Draw Circle");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Draw Rectangle");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Draw Triange");
	}
}

public class ShapeTest {
	public static void main(String[] args) {
//		ShapeTest sTest = new ShapeTest();
//		
		Shape[] sList = new Shape[3];
		sList[0] = new Circle();
		sList[1] = new Rectangle();
		sList[2] = new Triangle();
		
		for(Shape s : sList) {
			s.draw();
		}
		
//		for(int i=0; i<sList.length; i++) {
//			sList[i].draw();
//		}
		
		
//		Circle c = new Circle();
//		sTest.drawShape(c);
//		sTest.drawShape(new Rectangle());
//		sTest.drawShape(new Triangle());
	}
	
	public void drawShape(Shape s) {
		s.draw();	//이 부분이 다형성이다. 이 코드는 안바뀌는데 때에 따라 Draw Circle, Draw Rectangle, Draw Triangle이 된다. 

	}
}
