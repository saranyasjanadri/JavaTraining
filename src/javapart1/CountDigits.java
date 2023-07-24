package javapart1;

public class CountDigits {

	public static void main(String[] args)
	{
	   int num = 4568;
	   int count = 0;
	   
	   
	   while(num!=0)
	   {
		   num=num/10;//num/=10 also same
	       count ++;
	       
	   }
	   System.out.println("Number of digits are: "+ count);
	   

	}

}
