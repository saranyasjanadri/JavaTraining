package oopspart3;

public class AssignmentExceptions {
	
	
	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		
		
	    int a[]=null;
		try
		{
			System.out.println(a.length);
		}
		catch(NullPointerException e)
		{
			System.out.println("Entered into the catch block");
		}
		finally
		{
			System.out.println("Entered into the finally block");
		}
		
		
		
		
		
		
		String s ="abc";
		try
		{
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		
		catch(NumberFormatException e)
		{

			System.out.println("Entered into the catch block");
		}
		finally
		{
			System.out.println("Entered into the finally block");
		
		}
		
		System.out.println("Program Exited");
		
	}

}
