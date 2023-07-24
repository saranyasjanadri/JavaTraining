package oopspart3;

/*Unchecked Exceptions-->Exceptions which are not checked /identified
  by the compiler*/

public class UncheckedExceptions {

	public static void main(String[] args)
	{
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		int a=100;
		int res=0;
		
		
		
/*Here Exception names are the pre defined classes.
  
  For handling Exceptions:
  Whichever statement throws the Exception ,put that in the try block.
  Whenever the statement throws the Exception try block will be triggered
  and catch block will catch the Exception and handle it.
  One try block can have only one catch block or multiple catch blocks 
  specified with different Exception names as we expected.So whichever 
  exception it matches in the catch block will execute */
		
		
		
		try
		{
			//System.out.println(a/0);//Throws ArithmeticException
			
			
//Here in this case it doesn't throws any exception & gives the o/p as 50
			//System.out.println(a/2);
			
			
//This dosen't throws Exception
			//res=a/2;//case1
			
// This throws Exceptions and gives the pre initialized value of res as 0
			res=a/0;//case2
					
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Entered into the catch block");
			
		}
		
		System.out.println(res);
		
		
		
		
		
		
		/*Suppose if we don't know what kind of exception it throws just
		 add Exception to the catch block. It is the super class of all 
		 kinds of Exceptions. So the catch block can handle any kind of
		 Exception the statement throws to the catch block*/
		
		String s =null;
		try
		{
		System.out.println(s.length()); //Throws NullPointerException
		
		}
		
		//This can reduce the number of catch blocks assumed and specified 
		catch(Exception e)
		{
			System.out.println("Entered into the catch block");
		}
		
		
		
		
		
		
		
		
		/*String x="abc";
		
		This is for the conversion of string to integer datatype,but
		abc cannot be converted from string to int.If String x="123" in
		this case its possible to convert from string to int.
		
		int i=Integer.parseInt(x);*/ //Throws NumberFormatException
		
		
		
		
		
		
		
		
		/*int arr[]=new int[5];
		arr[10]=100;*/ //ThrowsArrayIndexOutOfBoundException
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");

		
		
		
	}

}
