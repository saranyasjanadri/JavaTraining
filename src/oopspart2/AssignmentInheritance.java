package oopspart2;

class Teacher
{
	String designation;
	String collegeName;
	void does()
	{
		System.out.println("Teaching");
		System.out.println("Computer "+designation+" is from "+collegeName); 
	}
}



public class AssignmentInheritance extends Teacher
{

	public static void main(String[] args) 
	{
		 AssignmentInheritance aih=new  AssignmentInheritance();
		 
		 aih.designation="Teacher";
		 aih.collegeName="BeginnersBook";
		 aih.does();
		 
	}

}
