package fridayTest;


class Shape {
	void draw() {
		System.out.println("Drawing Shape");
	}
	
	void erase() {
		System.out.println("Erasing Shape");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
	
	@Override
	void erase() {
		System.out.println("Erasing Circle");
	}
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Triangle");
	}
	
	@Override
	void erase() {
		System.out.println("Erasing Triangle");
	}
}

class Square extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Square");
	}
	
	@Override
	void erase() {
		System.out.println("Erasing Square");
	}
}

public class Question2 {

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape triangle = new Triangle();
		Shape square = new Square();
		
		circle.draw();
		circle.erase();
		
		triangle.draw();
		triangle.erase();
		
		square.draw();
		square.erase();


	}

}
