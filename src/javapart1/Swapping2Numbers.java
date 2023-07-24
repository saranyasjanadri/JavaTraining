package javapart1;

public class Swapping2Numbers
{
	public static void main(String[] args)
	{
		
		int a=50;
		int b=90;
		
		
	  System.out.println("Before Swapping values are:"+ a + "\t" + b);
		
	  //Logic 1: Using Third/Temporary variable
	  /*int c=a;
		a=b;
		b=c;*/
	  
		
	  //Logic 2: Use + & --> without using third variable
		
	  /*a=a+b;
		b=a-b;
		a=a-b;*/
	  
	  
	  
	    //Logic 3: Use * & /--> without using third variable
	    //Here a & b values should not be 0
	  
	  /*a=a*b;
	    b=a/b;
	    a=a/b;*/
	  
	  
	    //Logic 4: Use bitwise XOR (^ - CharAt operator)
	  
	  /*a=a^b;
	    b=a^b;
	    a=a^b;*/
	  
	    
	    //Logic 5: Using single statement
	    
	     b=a+b-(a=b);
	  
	  
		
		System.out.println("After Swapping values are:"+ a + "\t"+ b);
		
		

	}

}
