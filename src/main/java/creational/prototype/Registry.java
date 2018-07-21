package creational.prototype;

import java.util.HashMap;
import java.util.Map;

// Meat of crux of prototype pattern
public class Registry {
	
	private Map<ItemType, Item> items = new HashMap<ItemType, Item>();
	
	public Registry() {
		
		Movie movie = new Movie();
		movie.setPrice(5.67);
		movie.setTitle("Fukrey");
		movie.setUrl("imdb/fukrey");
		movie.setTimeLength(2.12);
		items.put(ItemType.MOVIE, movie);
		
		Book book = new Book();
		book.setTitle("7-Habits of highly effective people");
		book.setPageNumber(153);
		book.setPrice(354);
		book.setUrl("amazon/7-habits");
		items.put(ItemType.BOOK, book);
	}
	
	// This is where everything happens
	// we use clone method here thus prototype pattern
	//one item of each type is stored in the map of this registry which is cloned
	// everytime a request comes
	public Item createItem(ItemType itemType) {
		Item item = null;
		try {
			item = (Item) (items.get(itemType)).clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return item;
	}

}
