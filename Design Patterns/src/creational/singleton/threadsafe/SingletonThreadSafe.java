package creational.singleton.threadsafe;

public class SingletonThreadSafe {
	private static SingletonThreadSafe myInstance;
	private SingletonThreadSafe() {}
	public static synchronized SingletonThreadSafe getInstance() {
		if(myInstance==null) {
			myInstance=new SingletonThreadSafe();
		}
		return myInstance;
	}
}
