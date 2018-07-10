package creational.singleton;

/*
* A thread Unsafe and Lazily loaded Singleton class - faster - 
* And saving from Reflection
* */
public class Singleton3 {
	
	private static Singleton3 singleton3 = null;
	
	private Singleton3() {
		if(singleton3 != null) {
			throw new RuntimeException("use getInstance() method"); //Reflection Safe
		}
	};
	
	public static Singleton3 getInstance() {
		if(singleton3 == null) 
			singleton3 = new Singleton3();
		return singleton3;
	}

}
