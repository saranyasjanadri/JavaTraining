package oopspart3;

//Exception is an abnormal condition.
/*In java, exception is an event that disrupts the normal flow 
  of the program.
  Checked Exceptions-->Exceptions checked/identified by the compiler.
  Design time itself it shows the Exceptions.
  Here without handling the exception thrown we cannot execute the program*/


//Exception names are the predefined classes

public class CheckedExceptionDemo {

	/*1st way of handling the exception by using throws keyword
	  in the method where the statement is present */
	
	public static void main(String[] args) throws InterruptedException
	{

		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		
		/*Compiler shows that this statement throws Unhandled exception
		  type InterruptedException	and gives the suggestions for quick 
		  fixes as 1)add throws declaration 2)surround with try/catch.
		  from this we can click any one of these to get auto code*/
		 
		/*This waits for 5 seconds and executes the remaining statements
		  Thread.sleep(milliseconds);*/
		 
		//Thread.sleep(5000);
		
		
		
		
		
		/*2nd way of handling Exception-->
		 This try & catch block is the predefined suggestion handling
		 given by the compiler.Here we have to insert the particular
		 statement thrown an exception in the try block*/
		
		
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//This is optional
		}*/
		
		
		Thread.sleep(5000);
		
		
		
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
	}

}
