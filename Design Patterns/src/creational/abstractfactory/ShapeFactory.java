package creational.abstractfactory;

public class ShapeFactory extends AbstractFactory{
	public Shape getShape(String shapeType) {
		if(shapeType==null)
			return null;
		else if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Square"))
			return new Square();
		else if(shapeType.equalsIgnoreCase("Rectangle")) 
			return new Rectangle();
		return null;
	}

	@Override
	Color getColor(String colorName) {
		return null;
	}	
}
