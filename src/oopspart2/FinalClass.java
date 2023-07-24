package oopspart2;

//final class cannot be extend into child class/inherited
final class Bike1
{
	int speed=40;
	void run()
	{
		System.out.println(speed);
	}
}


class Honda1 extends Bike1 //compile time error
{
	
}


public class FinalClass
{

	public static void main(String[] args) {
		

	}

}
