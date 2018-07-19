package creational.singleton.eager;

public class SingletonEager {
	private static final SingletonEager myInstance = new SingletonEager();
	private SingletonEager() {}
	public static SingletonEager getInstance() {
		return myInstance;
	}
}
