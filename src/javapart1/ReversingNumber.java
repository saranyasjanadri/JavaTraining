package javapart1;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args)
	
	{
		//System.in --> Reads data from the keyboard
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		
		
		//1st way -- Using algorithm 
		//This method doesn't work when we give 0s at the ending
		
	  /*int rev=0;
		while(num!=0)
		{   
		    int d=num%10;//To find the last number(remainder)
			rev=rev*10 + d;
			num=num/10;//To delete the last number in the num
			
		}*/
		
		
		
		
		
		
		//2nd way-- Using StringBuffer class method
		
		
		/*Creating a rev variable of StringBuffer type.
		  StringBuffer acts like datatype*/
		
	    StringBuffer rev;
		
		
		
		/*String.valueOf(num) method converts the number into string 
		 format and that string value will be stored inside the
		 StringBuffer variable sb*/
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		rev=sb.reverse();
		
		//StringBuffer rev =sb.reverse();//We can write this directly
		
		
		
		
		
		
		
		//3rd way-- Using StringBuilder class method
		
				
		/*StringBuilder sbl =new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();*/
		
		
		System.out.println("Reverse Number is: " +rev);
		

	}

}
