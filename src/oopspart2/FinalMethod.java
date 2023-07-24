package oopspart2;

class Bike
{
	//final method cannot be override in the child classes
	final void run()//final method
	{
		System.out.println("Running");
	}
}

class Honda extends Bike 
{
	void run()//compile time error
	{
		System.out.println("Started");
	}
}


public class FinalMethod
{

	public static void main(String[] args) {
		

	}

}
