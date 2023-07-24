package oopspart2;


/*Creating methods/constructors with the same name but
  with different parameters.For time and memory saving
  Note:No of parameters or datatype of parameters or return type
  of the method should be different to make each method unique
  ie)simply we should change the definition of the each method */

//With or without inheritance also we can achieve Method overloading 

public class MethodOverloading 
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a,double b)
	{
		System.out.println(a+b);
	}
	
	void add(double a,double b)
	{
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) 
	{
		MethodOverloading mo=new MethodOverloading();
		mo.add(10,20);
		mo.add(10,20.5);
		mo.add(10.5,10.3);
		mo.add(30,40,50);
		

	}

}
