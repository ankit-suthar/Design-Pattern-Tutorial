package creational.singleton;

/*
* A thread Unsafe and Lazily loaded Singleton class - faster - Improves performance as App can come up faster
* */
public class Singleton2 {
	
	private static Singleton2 singleton2 = null;
	
	private Singleton2() {};
	
	public static Singleton2 getInstance() {
		if(singleton2 == null) 
			singleton2 = new Singleton2();
		return singleton2;
	}

}
