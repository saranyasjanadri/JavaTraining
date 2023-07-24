package oopspart3;

 /*Multiple inheritance --is multiple parents & 1 child class
   it can be achieved only by using interface
   and implements keyword*/

interface ABC //Parent interface 1 
{
	int x=100;
	void m1();
	
}

interface XYZ //Parent interface 2
{

	int y=200;
	void m2();
	
}


public class MultipleInheritance implements ABC,XYZ //only 1 Child class
{
 
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}
	
	
	public static void main(String[] args)
	{
		MultipleInheritance min =new MultipleInheritance();
		min.m1();
		min.m2();
		
	}

}
