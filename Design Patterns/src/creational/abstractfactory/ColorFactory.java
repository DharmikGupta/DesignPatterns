package creational.abstractfactory;

public class ColorFactory extends AbstractFactory{
	public Color getColor(String colorName) {
		if(colorName==null)
			return null;
		else if(colorName.equalsIgnoreCase("Red"))
			return new Red();
		else if(colorName.equalsIgnoreCase("Green"))
			return new Green();
		else if(colorName.equalsIgnoreCase("Blue"))
			return new Blue();
		return null;
	}
	
	@Override
	Shape getShape(String shapeName) {
		return null;
	}
}
