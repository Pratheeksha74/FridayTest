package fridayTest;

class Fruit {
	String name;
	String taste;
		
	void eat() {
		System.out.println("The name of the fruit is "+name+" and it tastes "+taste+".");
	}
}

class Apple extends Fruit {
	@Override 
	void eat() {
		System.out.println("The name of the fruit is "+super.name+ " and it tastes like "+super.taste);
	}
}

class Orange extends Fruit {
	@Override 
	void eat() {
		System.out.println("The name of the fruit is "+super.name+ " and it tastes like "+super.taste);
	}
}

public class Question1 {

	public static void main(String[] args) {
		Fruit orange = new Orange();
		orange.name = "Orange";
		orange.taste = "Bitter";
		orange.eat();
		
		Fruit apple = new Apple();
		apple.name = "Apple";
		apple.taste = "Sweet";
		apple.eat();

	}

}
