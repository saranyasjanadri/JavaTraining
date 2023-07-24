package oopspart2;


public class ExampleClassSuper 
{
   // String color ="White Animal";//Overriding of the variable 
   
	
	/*void eating()
    {
	System.out.println("Eating");
    }*/
	
	ExampleClassSuper()//Constructor
	{
		System.out.println("Animal created");
	}

}

class Dog extends ExampleClassSuper
{
	//String color="Black Animal";//Overriding of the variable
	
	
	
	/* 1st--Using super keyword to refer immediate parent class
	  instance variable.*/
	/*void displaycolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}*/
	
	
	
	//2nd---super can be used to invoke immediate parent class method
	/*void eating()
	{
		System.out.println("Eating Bread");
		super.eating();
	}*/
	
	
	
	//3rd--super() can be used to invoke parent class constructor
	Dog()
	{
		super();//constructor call must be the 1st statement in a constructor	
		System.out.println("Dog is created");
		//super(); its not valid in other place
		
	}
	

}
