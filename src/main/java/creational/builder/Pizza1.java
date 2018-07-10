package creational.builder;

/**
 * This is example of all setter class
 * The object has not contract defined
 * It is mutable i.e we can change its datamembers at any time which is dangerous
 * */
public class Pizza1 {

	private int size;
	private boolean cheese;
	private boolean pepperoni;
	private boolean bacon;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isCheese() {
		return cheese;
	}
	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}
	public boolean isPepperoni() {
		return pepperoni;
	}
	public void setPepperoni(boolean pepperoni) {
		this.pepperoni = pepperoni;
	}
	public boolean isBacon() {
		return bacon;
	}
	public void setBacon(boolean bacon) {
		this.bacon = bacon;
	}
	
	
}
