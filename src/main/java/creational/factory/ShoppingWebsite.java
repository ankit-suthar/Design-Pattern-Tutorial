package creational.factory;

import java.util.List;

public class ShoppingWebsite extends Website {
	
	public ShoppingWebsite() {
		pages.add("CartPage");
		pages.add("CheckoutPage");
		pages.add("paymentPage");
	}
	
	public List<String> getPages() {
		return pages;
	}

}
