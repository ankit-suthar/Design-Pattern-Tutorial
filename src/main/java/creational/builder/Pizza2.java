package creational.builder;
/*
 * Uses Telescopic Constructor anti-pattern
 * This is immutable
 * but Flexibility gone -  for pizza with size and pepperoni new constructor required
 * 
 * */
public class Pizza2 {

	private int size;
	private String cheese;
	private String pepperoni;
	private String bacon;

	public Pizza2(int size) 
	{ 
		this.size = size;
	}

	public Pizza2(int size, String cheese)
	{ 
		this(size);
		this.cheese = cheese;
	}

	public Pizza2(int size, String cheese, String pepperoni) 
	{  
		this(size,cheese);
		this.pepperoni = pepperoni; 
	}

	public Pizza2(int size, String cheese, String pepperoni, String bacon) {
		this(size,cheese,pepperoni);
		this.bacon = bacon;
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
