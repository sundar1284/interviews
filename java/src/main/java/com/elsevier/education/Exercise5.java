package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public enum Singleton {
		//Enum is preferred if lazy initialization is not priority
		instance;
		public static void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton.doSomething();
	}
}