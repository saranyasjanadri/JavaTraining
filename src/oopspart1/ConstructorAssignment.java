package oopspart1;

public class ConstructorAssignment 
{
	int a,b,c;
	
	ConstructorAssignment()
	{
		 a=10;
		 b=20;
		 c=30;
		
	}
	
	ConstructorAssignment(int x,int y,int z)
	{
		 a=x;
		 b=y;
		 c=z;
		
	}
	
	
	void sum()
	{
		System.out.println("Sum of 3 numbers: "+(a+b+c));
	}

	
	
	public static void main(String[] args)
	{
		ConstructorAssignment cal1=new ConstructorAssignment();
		cal1.sum();
		
		ConstructorAssignment cal2=new ConstructorAssignment(80,40,30);
		cal2.sum();
		

	}

}
