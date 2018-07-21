package creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
	
		Registry registry = new Registry();
		Book book1 = (Book) registry.createItem(ItemType.BOOK);
		System.out.println(book1);
		System.out.println(book1.getTitle());
		book1.setTitle("Design Patterns");
		// can set data members as require
		
		Book book2 = (Book) registry.createItem(ItemType.BOOK);
		book2.setTitle("Gang of four");
		System.out.println(book2.getTitle());
		System.out.println(book2);
		//Both different objects created
	}
	
}
