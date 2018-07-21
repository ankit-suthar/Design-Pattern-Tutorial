package creational.abstractFactory;

public class VisaFactory extends CreditCardFactory{

	@Override
	public CreditCard getCreditCard(int creditScore) {
		if(creditScore > 600)
			return new VisaPlatinumCreditCard();
		else
			return new VisaGoldCreditCard();
	}

}
