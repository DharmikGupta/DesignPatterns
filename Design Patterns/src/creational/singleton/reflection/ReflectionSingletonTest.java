package creational.singleton.reflection;

import java.lang.reflect.Constructor;

import creational.singleton.eager.SingletonEager;

public class ReflectionSingletonTest {
	public static void main(String[] args) {
		SingletonEager myInstance1 = SingletonEager.getInstance();
		SingletonEager myInstance2 = null;
		try {
			Constructor[] constructors = SingletonEager.class.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				constructor.setAccessible(true);
				myInstance2 = (SingletonEager)constructor.newInstance();
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(myInstance1.hashCode());
		System.out.println(myInstance2.hashCode());
	}
}
