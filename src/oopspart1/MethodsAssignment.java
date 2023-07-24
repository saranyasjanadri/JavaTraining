package oopspart1;


//Method Overloading 
class Calculation
{
		
	int sum(int x,int y)
	{
		return(x+y);
	}
	
	
	int sum(int x,int y,int z)
	{
		return(x+y+z);
	}
	
	
	double sum(double x, double y)
	{
		return (x+y);
	}
	
	
	double sum(double x, double y, double z)
	{
		return (x+y+z);
	}
	
	
}

public class MethodsAssignment 
{

	public static void main(String[] args)
	{
		Calculation cal=new Calculation();
		int res1=cal.sum(10,20);
		int res2=cal.sum(10,20,30);
		double res3=cal.sum(3.3,4.4);
		double res4=cal.sum(10.2,10.3,10.4);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		      
	}

}
