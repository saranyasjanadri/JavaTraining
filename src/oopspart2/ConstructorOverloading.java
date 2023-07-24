package oopspart2;

public class ConstructorOverloading
{
	
		ConstructorOverloading(int a,int b)
		{
			System.out.println(a+b);
		}
		
		ConstructorOverloading(int a,double b)
		{
			System.out.println(a+b);
		}

		ConstructorOverloading(int a,int b,int c)
		{
			System.out.println(a+b+c);
		}
		
		ConstructorOverloading(double a,int b)
		{
			System.out.println(a+b);
		}
		
		public static void main(String[] args)
		{
			
		ConstructorOverloading co=new ConstructorOverloading(10,20);
		ConstructorOverloading co1 =new ConstructorOverloading(10,20,30);
		ConstructorOverloading co2 =new ConstructorOverloading(10.6,20);
		ConstructorOverloading co3 =new ConstructorOverloading(10,20.8);


	}

}
