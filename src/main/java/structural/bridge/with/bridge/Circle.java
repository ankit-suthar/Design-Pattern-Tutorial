package structural.bridge.with.bridge;

// now circle will be concrete class and utilize Color
public class Circle extends Shape{

	public Circle(Color color) {
		super(color);
	}

	// utilizing composition
	@Override
	public void applyColor() {
		color.applyColor();
		
	}

}
