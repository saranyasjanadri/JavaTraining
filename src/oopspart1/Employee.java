package oopspart1;


//Demo of class, methods & objects
//Class is an collection of variables & methods


//Main method present in the same class
public class Employee
{
	
	
	//Class variables or instance variables
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	
	//Method is a block of code or sub program which contains an logic
	
	//If we don't specify any access modifier by default it is (default)
	void display()//returntype methodname()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}
	
	
	
	public static void main(String[] args)
	{
	
		//To create an object
		//An object is an instant of an class
		Employee emp1=new Employee();
		
		
		
		//emp1 is called as object reference variable.
		// Each object accquires its own copy of its variables and methods
		emp1.eid=101;
		emp1.ename="David";
		emp1.sal=25000.00;
		emp1.deptno=10;
		emp1.job="Manager";
		emp1.display();
		
		
		System.out.println();
		
		
		
		//Second object
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="John";
		emp2.sal=55000.00;
		emp2.deptno=20;
		emp2.job="CEO";
		emp2.display();
		
		
		

	}

}
