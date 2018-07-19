package creational.singleton.lazy;

public class SingletonLazy {
	private static SingletonLazy myInstance;
	private SingletonLazy() {}
	public static SingletonLazy getInstance() {
		if(myInstance==null) {
			myInstance = new SingletonLazy();
		}
		return myInstance;
	}
}
