package com.wipro.test;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance(String userName, String passWord) {
		if (userName.equals("Abu") &&passWord.equals("Test123"))
			return singleton;
			return null;
	}
	
	public void display(){
		System.out.println("Display Function");
	}

}
