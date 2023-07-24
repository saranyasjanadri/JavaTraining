package javapart2;

public class Even_OddinArray {

	public static void main(String[] args) 
	{
		//To find even and odd numbers in an array
		int a[]={1,2,3,4,5,6,7,8,0};
		int len=a.length;
		
		//To print odd numbers
		System.out.println("Odd Numbers in the array are:");
		
		for(int i=0;i<len;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		
		
		//To print even numbers
		System.out.println("Even Numbers in the array are");
				for(int i=0;i<len;i++)
				{
					if(a[i]%2==0)
						System.out.println(a[i]);
				}
				
		

	}

}
