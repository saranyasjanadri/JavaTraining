package javapart2;

public class String_Methods_Assignment1 {

	public static void main(String[] args) 
	{
		//To capture only the number of pages from the string(456)
		 String text="Showing 1 to 10 of 60 (456 Pages)";
	     
		 
		 //Index counting always start from 0
		 System.out.println(text.indexOf("("));//22
	    
		 
		 //It returns the index of wherever the Pages started 
	     System.out.println(text.indexOf("Pages"));//27
	     
	     
	     
	     //text.indexOf("(")+1--->This gives the starting index
	     //text.indexOf("Pages")-1---->This gives the ending index
	     //substring---> returns the string present between the starting
	     //and the ending index
	     System.out.println(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	     
	     
	     //To convert the string value to integer value
	     int data=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	     System.out.println(data);
	
	
	}

}
