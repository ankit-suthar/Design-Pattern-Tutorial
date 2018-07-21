package creational.prototype;

public enum ItemType {

	MOVIE(1),
	BOOK(2);
	
	private int id;

	private ItemType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
