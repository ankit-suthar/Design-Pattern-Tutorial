package structural.bridge.withoutBridge;

public class Runner {

	public static void main(String[] args) {
		
		Circle blueCircle = new BlueCircle();
		Square greenSquare = new GreenSquare();

		blueCircle.applyColor();
		greenSquare.applyColor();
		// now we need to add red Rectangle
		// now we need to add a rectangle that is blue, green or any other color with implementation.
		// this is not scalable.
		// and if we need to add new color we need to add all shapes for it.
		
	}

}
