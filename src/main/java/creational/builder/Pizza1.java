package creational.builder;

/**
 * This is example of all setter class - Flexible Bean Approach
 * The object has not contract defined
 * It is mutable i.e we can change its datamembers at any time which is dangerous - 
 * incosistent also - as it can be accesed before fully created. 
 * */
public class Pizza1 {

	private int size;
	private String cheese;
	private String pepperoni;
	private String bacon;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String isCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public String isPepperoni() {
		return pepperoni;
	}
	public void setPepperoni(String pepperoni) {
		this.pepperoni = pepperoni;
	}
	public String isBacon() {
		return bacon;
	}
	public void setBacon(String bacon) {
		this.bacon = bacon;
	}
}
