package creational.builder;
/*
 * Builder design Pattern
 * Has a Static class
 * It is immutable as Telescopic Constructor way
 * and is flexible as bean Approach
 * */
public class Pizza3 {
	private int size;
	private String cheese;
	private String pepperoni;
	private String bacon;

	// A static Builder Inner Class which has all data-members as above
	public static class Builder {

		//required
		private final int size;
		//optional
		private String cheese ;
		private String pepperoni ;
		private String bacon ;

		public Builder(int size) {
			this.size = size;
		}

		//Each method (kind of setter) of this king returns a builder object
		// it returns the same object of Builder
		public Builder addCheese(String cheese) {
			this.cheese = cheese;
			return this;
		}

		public Builder addPepperoni(String pepperoni) {
			this.pepperoni = pepperoni;
			return this;
		}

		public Builder addBacon(String bacon) {
			this.bacon = bacon;
			return this;
		}

		// Finally a build method calling constructor
		public Pizza3 build() {
			return new Pizza3(this);
		}
	}

	// Constructor taking builder object as parameter
	private Pizza3(Builder builder) {
		size = builder.size;
		cheese = builder.cheese;
		pepperoni = builder.pepperoni;
		bacon = builder.bacon;
	}

	public int getSize() {
		return size;
	}

	public String isCheese() {
		return cheese;
	}

	public String isPepperoni() {
		return pepperoni;
	}

	public String isBacon() {
		return bacon;
	}
}