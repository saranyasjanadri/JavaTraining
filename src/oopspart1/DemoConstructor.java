package oopspart1;

public class DemoConstructor
{
	int x;
	int y;
	
	//Constructors are used only for initializing the variables or values
	//Constructor does not return any value(not even void)
	//Constructor name should be same as class name
	
	
	DemoConstructor()//Default Constructor
	{
		x=10;
		y=20;
	}
	
	
	
	DemoConstructor(int a,int b)//Parameterized Constructor
	{
		x=a;
		y=b;
	}
	
	
	
	//Methods are used for writing the logic
	void display()
	{
		System.out.println(x+y);
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
//Constructor will automatically invoked at the time of object creation
		
		
		//Invokes Default Constructor
		DemoConstructor con1 =new DemoConstructor();
		con1.display();
		
		
		//Invokes Parameterized Constructor
		DemoConstructor con2 =new DemoConstructor(100,200);
		con2.display();

	}

}
