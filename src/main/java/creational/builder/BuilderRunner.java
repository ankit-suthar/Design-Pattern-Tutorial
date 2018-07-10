package creational.builder;

public class BuilderRunner {
	
	
	public static void main(String[] args) {
		
		//Flexible bean approach, object can be modified anytime.
		Pizza1 pizza1 = new Pizza1();
		pizza1.setBacon("meat");
		//Do something
		pizza1.setBacon("ham");
		
		
		//Telescopic Constructor Approach, not flexible but gives immutable object
		Pizza2 pizza2 = new Pizza2(5, "mozerella", "extra");
		//pizza2 cannot be modified now but 
		// we cannot create a pizza which has size, cheese and bacon known only
		
		//Builder pattern approach
		Pizza3.Builder builder = new Pizza3.Builder(5);  // compuslory field needed, i.e  contract will be satisfied
		Pizza3 pizza3 = builder.addCheese("mozzerela").addBacon("meat").build();
		// now pizza3 cannot be modified.
		// we also have flexibility of using any ingredients in any order.
		// useful example like reading from csv etc. eg:
		Pizza3 pizza3_2 = builder.addPepperoni("more").build();
		System.out.println(pizza3);
		System.out.println(pizza3_2);
		//both different objects
		
	}
	
}
