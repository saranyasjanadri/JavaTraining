package oopspart3;


class A1
{
	void m1()
	{
		System.out.println("m1 method from A1 class");
	}
}

interface B1
{
	void m2();
}


interface B2
{
	void m3();
	
}



/*This can be as child class.This class by default get m1 method
   but m2 & m3 we have to implement. Now this class gets everything from
   A1 class, B1 interface & B2 interface*/


public class HybridInheritance extends A1 implements B1,B2
{
  public void m2()
  {
	  System.out.println("m2 method from B1 interface");
  }
  
  public void m3()
  {
	  System.out.println("m3 method from B2 interface");
  }
  
  
  
	public static void main(String[] args)
	{
	 
	  HybridInheritance hi= new HybridInheritance();
	  hi.m1();
	  hi.m2();
	  hi.m3();
	  

	}

}
