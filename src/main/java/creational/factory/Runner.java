package creational.factory;

public class Runner {

	public static void main(String[] args) {
		
		Website site1 = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		Website site2 = WebsiteFactory.getWebsite(WebsiteType.SHOPPING_SITE);
		
		System.out.println("Site1: ");
		site1.getPages().stream().forEach(s -> System.out.print(s+" "));
		
		System.out.println("\n\nSite2: ");
		site2.getPages().stream().forEach(s -> System.out.print(s+" "));
	}
}
