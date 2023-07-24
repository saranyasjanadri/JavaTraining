package oopspart2;

/*Acquiring all the properties & behavior from one class 
  to another is called as Inheritance.Its mainly for reusability of the 
  variables & the methods & avoiding the duplication of the methods
  & variables*/


//Single & Multilevel Inheritance
//Parent class/Base class/Super class
class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

//Child class/Sub class/Derived class

class B extends A //Here B is the child class & A is the parent class for B

{
	int b;
	void print()
	{
		System.out.println(b);
	}
}

/*extends keyword doesn't support to extend multiple classes at a time like 
  class C extends B,A --its not valid*/
class C extends B //Here C is the child class & B is the parent class for C
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}


public class InheritanceDemo {

	public static void main(String[] args)
	{
		A abc=new A();
		abc.a=100;
		abc.display();
		
		System.out.println();
		
		
		
		//Single Inheritance
		B obj=new B();//child class can access both parent & child class features
		obj.a=10;
		obj.b=20;
		
		obj.display();
		obj.print();
		
		System.out.println();
		
		
		
		//Multilevel Inheritance
		C obj1= new C();
		obj1.a=10;
		obj1.b=20;
		obj1.c=30;
		
		obj1.display();
		obj1.print();
		obj1.show();
		
		
	

	}

}
