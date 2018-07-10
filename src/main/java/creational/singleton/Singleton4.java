package creational.singleton;

/*
* A thread safe and Lazily loaded Singleton class - faster - 
* And saving from Reflection
* THREAD SAFE
* */
public class Singleton4 {
	
	private static volatile Singleton4 singleton4 = null;  //fixed in java 5
	// volatile ensures unsynchronized method when the instance variable is set
	
	private Singleton4() {
		if(singleton4 != null) {
			throw new RuntimeException("use getInstance() method"); //Reflection Safe
		}
	};
	
	//Double locking Mechanism used
	// Can synchronize whole block but that is costly in computation
	public static Singleton4 getInstance() {
		if(singleton4 == null) {
			synchronized (Singleton4.class) {
				if(singleton4 == null) {
					singleton4 = new Singleton4();
				}
			}		
		}
		return singleton4;
	}

}
