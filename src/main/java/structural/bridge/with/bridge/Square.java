package structural.bridge.with.bridge;

public class Square extends Shape{

	public Square(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}

}
