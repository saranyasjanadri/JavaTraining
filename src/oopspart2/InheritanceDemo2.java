package oopspart2;
//Hierarchical Inheritance

//In the same package we should not have multiple classes in the same name
class Parent 
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}


class Child1 extends Parent
{
	int x;
	void show()
	{
		System.out.println(x);
	}
}


class Child2 extends Parent
{
	int y;
	void print()
	{
		System.out.println(y);
	}
}


/*Wherever main exists that is called as main class.
  File name should be same as the main class name*/

public class InheritanceDemo2 {

	public static void main(String[] args)
	{
		Child1 c1=new Child1();
		c1.a=100;
		c1.x=200;
		c1.display();
		c1.show();
		
		System.out.println();
		
		Child2 c2=new Child2();
		c2.a=10;
		c2.y=20;
		c2.display();
		c2.print();
		

	}

}
