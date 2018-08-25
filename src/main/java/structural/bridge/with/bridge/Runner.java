package structural.bridge.with.bridge;

public class Runner {

	public static void main(String[] args) {
		// now we will use composition to tackle the problem.
		// shape will still be the interface or abstract class as we need it to be.
		// but it will compose color.
		
		Color blue = new BlueColor();
		Color green = new GreenColor();
		
		Circle blueCircle = new Circle(blue);
		Square greenSquare = new Square(green);
		
		blueCircle.applyColor();
		greenSquare.applyColor();
		
		// now  we can add new color or new shape without any concern
		// and we would not have an orthogonal problem

	}

}
