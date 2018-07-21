package creational.abstractFactory;

public class Runner {

	public static void main(String[] args) {
		//This factory returns a factory
		CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory("Visa");
		
		CreditCard creditCard1 = creditCardFactory.getCreditCard(789);
		CreditCard creditCard2 = creditCardFactory.getCreditCard(489);
		
		System.out.println(creditCard1+ "  "+ creditCard2);
		
		CreditCardFactory creditCardFactory2 = CreditCardFactory.getCreditCardFactory("Amex");
		
		CreditCard creditCard3 = creditCardFactory2.getCreditCard(789);
		CreditCard creditCard4 = creditCardFactory2.getCreditCard(489);
		
		System.out.println(creditCard3+ "  "+ creditCard4);
		
	}
}
