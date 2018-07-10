package creational.singleton;

public class SingletonRunner {

	public static void main(String[] args) {
		 long time1 = System.currentTimeMillis();
		 
		 Singleton1 singleton1_instance1 = Singleton1.getInstance();
		 Singleton2 singleton2_instance1 = Singleton2.getInstance();
		 Singleton4 singleton4_instance1 = Singleton4.getInstance();
		 
		 long time2 = System.currentTimeMillis();
		 
		 Singleton1 singleton1_instance2 = Singleton1.getInstance();
		 Singleton2 singleton2_instance2 = Singleton2.getInstance();
		 Singleton4 singleton4_instance2 = Singleton4.getInstance();
		 
		 long time3 = System.currentTimeMillis();
		 
		 System.out.println("Performance: ");
		 System.out.println("First time: " + (time2- time1));
		 System.out.println("Second time: "+ (time3 - time2));
		 
		 System.out.println(singleton1_instance1);
		 System.out.println(singleton1_instance2);
		 System.out.println("singleton1_instance1==singleton1_instance2: "+(singleton1_instance1==singleton1_instance2));
		 
		 System.out.println(singleton2_instance1);
		 System.out.println(singleton2_instance2);
		 System.out.println("singleton2_instance1==singleton2_instance2: "+(singleton2_instance1==singleton2_instance2));
		 
		 System.out.println(singleton4_instance1);
		 System.out.println(singleton4_instance2);
		 System.out.println("singleton4_instance1==singleton4_instance2: "+(singleton4_instance1==singleton4_instance2));
		 
		 
	}

}
