package abstract_factory;

public class ShapeFactory {

	public Shape getShape(String shapeName) {
		
		if(shapeName.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		else if(shapeName.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if(shapeName.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		else if(shapeName.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else {
			System.out.println("Invalid Input returns NULL");
			return null;
		}
		
	}
}
