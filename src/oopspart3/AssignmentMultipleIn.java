package oopspart3;

interface One
{
	int a=300;
	int b=400;
	void add();
	
}


interface Two
{
	int x=30;
	int y=40;
	void mul();
	
}


public class AssignmentMultipleIn implements One, Two
{
public void add()
{
	System.out.println(a+b);
}


public void mul()
{
	System.out.println(x*y);
}
	

public static void main(String[] args)
	{
		
	AssignmentMultipleIn ami=new AssignmentMultipleIn();
	ami.add();
	ami.mul();
	
	
	}

}
