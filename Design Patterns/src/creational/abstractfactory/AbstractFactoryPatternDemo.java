package creational.abstractfactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		//CIRCLE
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		
		//RECTANGLE
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		//Square
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		//RED
		Color color1 = colorFactory.getColor("Red");
		color1.fill();
		
		//GREEN
		Color color2 = colorFactory.getColor("Green");
		color2.fill();
		
		//BLUE
		Color color3 = colorFactory.getColor("Blue");
		color3.fill();
	}
}
