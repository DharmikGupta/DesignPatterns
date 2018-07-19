package creational.singleton.threadsafe;

public class SingletonDoubleCheckLock {
	private static SingletonDoubleCheckLock myInstance;
	private SingletonDoubleCheckLock() {}
	public static SingletonDoubleCheckLock getInstance() {
		if(myInstance==null) {
			synchronized (SingletonDoubleCheckLock.class) {
				if(myInstance==null) {
					myInstance = new SingletonDoubleCheckLock();
				}
			}
		}
		return myInstance;
	}
}
