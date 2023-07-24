package javapart2;

public class String_Methods_Assignment2 {

	public static void main(String[] args) 
	{
		String a= "Assignment";
		String a1= "on Java Strings";
		String a2= "Welcome";
		
		
		//To compare 2 strings ignoring case difference
		System.out.println(a.equalsIgnoreCase("assignment"));//true
		
		System.out.println(a.equals("assignment"));//false
		System.out.println(a.equals("Assignment"));//true
		System.out.println(a.equals(a1));//false
		
		
		
		//To concatenate a given string to the end of another string
		String b= a1.substring(7,15);
		System.out.println(a.concat(b));
		
		
		
		//To get the length of a given string
		System.out.println(a2.length());
		
		
		//To get a substring of a given string between 2 specified positions
		System.out.println(a.substring(0,6));
		
		
		//To convert all the characters to Uppercase 
		String s="shriya";
		System.out.println(s.toUpperCase());
		
		
		//To convert all the characters to Lowercase 
		String s1="SHRISH";
		System.out.println(s1.toLowerCase());
	
		
		
		
	}

}
