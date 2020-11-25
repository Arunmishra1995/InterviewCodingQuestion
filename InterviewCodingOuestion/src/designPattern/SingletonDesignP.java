package designPattern;
// The purpose of the singleton desing pattern is it will allow only one instance creation 

// Singleton pattern is used for logging, drivers objects, caching and thread pool.
// how we can implement sigleton design pattern we will se now , so there is 4 ways 
// 1. eager singleton design , lazy singleton design , thread safe singleton 

public class SingletonDesignP {
	int age;
	String name;
	private static SingletonDesignP instance;

	// step 1. private constructor to restrict instantiation of the class from other
	// class
	private SingletonDesignP(int age, String name) {
		this.age = age;
		this.name = name;

	}
	// public static method to check instance is already created or not and return instance  
	public static SingletonDesignP getInstance() {
		if(instance==null) {
			return  new SingletonDesignP(20,"arun");
		}
		return instance;  
		
	}

}
