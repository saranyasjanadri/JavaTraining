package oopspart3;


interface Calculate
{
	int a=10;
	int b=20;
	void sum();
	
}

class B implements Calculate
{
	public void sum()
	{
		System.out.println(a+b);
	}
}
public class AssignmentInterface extends B {

	public static void main(String[] args) 
	{
		
//This can be achieved by using extending B to AssignmentInterface class
		/*AssignmentInterface asi=new AssignmentInterface();
		asi.sum();*/
		
		//This can be possible without extend
		B bobj =new B();
		bobj.sum();
		
	}

}
