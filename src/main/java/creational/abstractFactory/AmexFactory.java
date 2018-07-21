package creational.abstractFactory;

public class AmexFactory extends CreditCardFactory{

	@Override
	public CreditCard getCreditCard(int creditScore) {
		if(creditScore > 750) 
			return new AmexPlatinumCreditCard();
		else
			return new AmexGoldCreditCard();
	}

}
