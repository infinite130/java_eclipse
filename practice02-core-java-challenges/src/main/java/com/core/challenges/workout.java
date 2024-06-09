package com.core.challenges;

public class workout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//print
		System.out.println("Hello World!");
		
		//Constructor Chaining
		//:Connecting constructors of either a single class or in inheritance
		
		//this():
			//Calling constructor of same class
		
			//While calling this(), we can pass parameters
		
		/*
		 * this(10);
		 * this(10, "abc");
		 * 
		 *  Call to this() method must be the first statement in the constructor
		 *  (From one constructor, we can call only one constructor)
		 */
		

	}

}

class Test {
	
	Test()
	{
		
		this(0);
		System.out.println("Hi");
	}
	Test(int x)
	{
		this(x,0);
		System.out.println("Hello");
	}
	
	Test(int x, int y)
	{
		System.out.println("Bye");
	}
	
	public static void main(String[] args) 
	{
	
		//Connect all the three constructors in Object creation
		
		Test test = new Test();
		
		System.out.println();
		
		
	}
	
}