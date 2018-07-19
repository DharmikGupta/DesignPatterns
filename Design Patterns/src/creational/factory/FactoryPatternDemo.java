package creational.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		//Cirlce
		Shape shape1 = sf.getShape("Circle");
		shape1.draw();
		
		//Square
		Shape shape2 = sf.getShape("Square");
		shape2.draw();
		
		//Rectangle
		Shape shape3 = sf.getShape("Rectangle");
		shape3.draw();
	}
}
