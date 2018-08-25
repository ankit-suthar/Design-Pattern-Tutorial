package structural.bridge.with.bridge;

public abstract class Shape {
	
	protected Color color;

	// now we have color composed and in constructor.
	public Shape(Color color) {
		super();
		this.color = color;
	}
	
	// this has apply color method and Color has which color to apply
	public abstract void applyColor();
}
