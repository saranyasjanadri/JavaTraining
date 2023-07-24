package javapart2;

public class StringMethods {

	public static void main(String[] args) 
	{
		String s="Welcome";
		String s1=" to Java ";
	    String s2="       train ing     ";
	    String s3= "Welcome to Java";
	    
	  
		
		//To find out length of the String
		System.out.println("Length of the String: " + s.length());
		System.out.println();
		
		
		
		//For concatenation/joining the Strings
		System.out.println(s+s1);//without string method
		System.out.println(s.concat(s1));//with string method
		System.out.println(s.concat(s1).concat(s3));
		System.out.println();
		
		
		
		//Returns character based on index num,index starts from 0 
		System.out.println(s.charAt(3));
		System.out.println();
		
		
		
		//To check any sequence of characters present in the string
		System.out.println(s.contains("Wel"));//true
		System.out.println(s.contains("wel"));//false-its case sensitive
		System.out.println();
		
		
		
		//Comparing the strings
		System.out.println(s.equals("Welcome"));//true
		System.out.println(s.equals("welcome"));//false-its case sensitive
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase("welcome"));//true 
		System.out.println();
		
		
		
		//Replacing characters/strings within a string
		System.out.println(s.replace('e','a'));
		System.out.println(s3.replace("Java", "Selenium"));
		System.out.println();
		
		
		
		
		//Trims the extra outer space but not the space between the words	
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println();
		
		
		
		
		//Extracting substring from the main string
		
		//s.substring(starting index, ending index)
		//Starting index starts from 0
		//Ending index starts from 1
		System.out.println(s.substring(4,7));//ome
		System.out.println(s.substring(0,4));//Welc
		System.out.println();
		
		
		
		
		//Converting cases
		s="WELCOME";// Reassigning for same variable
		System.out.println(s.toLowerCase());
		
		s="welcome";
		System.out.println(s.toUpperCase());
		
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		
		/*Splitting String-->Splits the text into different parts 
		  based on the provided text,symbol or space etc*/
		
		
		//Splits by using the space
		String str="The software tesing tutorials";
		String arr[]=str.split(" ");//Return type of split() method is an array
		for(String temp:arr)
		{
			System.out.println(temp);
		}
		
		System.out.println();
		System.out.println();
		
		
		//Splits by using the given text--> text is case sensitive 
		String str1="the software the tesing The tutorials the class";
		String arr1[]=str1.split("the");
		for(String temp:arr1)
		{
			System.out.println(temp);
		}
		
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		//Splits by using given symbol
		String str2="Selenium, Java, TestNG, Jenkins";
		String arr2[]=str2.split(",");
		for(String temp:arr2)
		{
			System.out.println(temp);
		}
		
		
		
				

	}

}
