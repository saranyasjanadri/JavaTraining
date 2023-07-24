package javapart2;

public class ArraywithStringValues {

	public static void main(String[] args) 
	{
		String a[]= {"one","two","three","four","two"};
		String search_string="two";
		boolean x= false;
		
		
		
		for(int i=0;i<a.length;i++)
		{
		if(search_string.equals(a[i]))
		{
		x=true;
			
		System.out.println(search_string + " is present in the location "+ (i+1));
		}
		}
		
		
		
		if(x==false)
		{
			System.out.println(search_string + " is not present in the array");
		}
		
			
		
	    /*for(String s:a)
		{
			if(search_string ==s)
			{
				System.out.println("Element found");
				x=true;
				//break;
			}
		}
		
		if(x==false)
		{
		System.out.println("Element not found");
		}*/

	}

}
