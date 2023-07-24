package oopspart1;

//Demo for assigning values for variables in 3 ways

public class StudentMain
{

	public static void main(String[] args)
	{
		
	//1st way--Assign values to variables By using the reference variable
		
		/*Student stu1=new Student();
		stu1.sid =1010;
		stu1.sname="John";
		stu1.grade='A';
		stu1.display();*/
		
	//2nd way--Assign values to variables By using method	
	
		/*Student stu1=new Student();
		stu1.getValues(1010,"John",'A');
		stu1.display();*/
		
	//3rd way--Assign values to variables By using constructor
	//Construtor will be automatically invoked at the time of object creation	
		
		Student stu1=new Student(1010,"John",'A');
		stu1.display();
		
		
		

	}

}
