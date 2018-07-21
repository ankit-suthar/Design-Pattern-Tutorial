package creational.abstractFactory;

//main factory which is an abstract class
public abstract class CreditCardFactory {

	// it is a factory of factory
	public static CreditCardFactory getCreditCardFactory(String cardType) {
		// can use enum for better type safety
		switch(cardType) {
		case "Visa": return new VisaFactory();
		case "Amex": return new AmexFactory();
		default: return new AmexFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(int creditScore) ;
}
