package oopspart3;

/*3 cases :
    1)Exception doesn't occur
    2)Exception doesn't occur and not handled
    3)Exception occurs and handled
    So in any of these cases also finally block definitely executes.
    But finally block is optional.*/

public class FinallyBlock {

	public static void main(String[] args)
	{
		System.out.println("Program Started");
		
		int a=100;
		
		/*case1-->Here Exception doesn't occurred, so no use of catch block
		 but also finally block will execute.*/
		 
		/*try
		{
			System.out.println(a/2);
		}
		
		catch (Exception e)
		{
			System.out.println("Entered in the catch block");
		}
		
		
		finally
		{
			System.out.println("Entered in the finally block");
		}*/
		
		
		
		
		
		/*case 2-->Here Exception occurred but not handled correctly
		  in the catch block,becoz we given wrong exception name but
		  still the finally block executes.*/
		
		/*try
		{
			System.out.println(a/0);
			
		}
		
		catch (NullPointerException e)
		{
			System.out.println("Entered in the catch block");
		}
		
		
		finally
		{
			System.out.println("Entered in the finally block");
		}*/
		
		
		
		
		
		
		
		/*case 3-->Here Exception occurred and also handled correctly,
		  and also finally block executes */
		
		try
		{
		System.out.println(a/0);
					
		}
				
		catch (ArithmeticException e)
		{
		System.out.println("Entered in the catch block");
		}
				
				
		finally
		{
		System.out.println("Entered in the finally block");
		}
		
		
		
		
		
		
		System.out.println("Program Exited");
		
		
		
	}
	

}
