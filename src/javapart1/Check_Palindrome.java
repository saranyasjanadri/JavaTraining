package javapart1;

public class Check_Palindrome {

	public static void main(String[] args)
	{
		int num=85458;
		int temp=num;
		int rev=0;
		
		while(num!=0)//We can also use while(num>0)
		{
			int last=num%10;//To get last number(remainder)
			rev=rev*10+last;//To store reverse of the given num
			num=num/10;//To delete last number in the num
		}
		
		if(temp==rev)
		{
			System.out.println(temp+" is a Palindrome");
		}
		else
		{
			System.out.println(temp+" is not a Palindrome");
		}
	}

}
