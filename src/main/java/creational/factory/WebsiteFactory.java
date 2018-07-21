package creational.factory;

public class WebsiteFactory {

	//static factory method
	public static Website getWebsite(WebsiteType websiteType) {
		
		switch(websiteType) {
		case BLOG: 
			return new BlogWebsite();
		case SHOPPING_SITE :
			return new ShoppingWebsite();
		default:
			return null;
		}
		
	}
}
