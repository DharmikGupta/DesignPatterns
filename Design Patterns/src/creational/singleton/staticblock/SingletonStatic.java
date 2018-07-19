package creational.singleton.staticblock;


public class SingletonStatic {
	private static SingletonStatic myInstance;
	private SingletonStatic() {}
	
	static {
		try {
			myInstance = new SingletonStatic();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static SingletonStatic getInstance() {
		return myInstance;
	}
}
