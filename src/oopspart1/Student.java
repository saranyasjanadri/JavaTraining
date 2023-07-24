package oopspart1;

//Demo for assigning values for variables in 3 ways

public class Student 
{
	//class variables
	int sid;
	String sname;
	char grade;
	
	
	Student(int id,String name, char g)//Construtor
	{
		sid=id;
		sname=name;
		grade=g;
	
	}
	
	
	/*This method will get values/parameters from the main method
	We have to pass these parameters from the main method*/
	
	//method variables /external variables
	void getValues(int id,String name, char g)
	{
		sid=id;
		sname=name;
		grade=g;
	
	}
	
	
	
	void display()
	{
		System.out.println(sid+" "+sname+" "+grade);
		
	}

}
