package oopspart1;

public class StudentAssignment 
{
	int sid;
	String sname;
	int sub1,sub2,sub3;
	
	
	void getStuData(int id,String name)
	{
		sid=id;
		sname=name;
	}
	
	
	
	void getStuMarks(int mark1,int mark2,int mark3)
	{
		sub1=mark1;
		sub2=mark2;
		sub3=mark3;
	}
	
	void totalMarks()
	{
		int total= sub1+sub2+sub3;
		System.out.println("sid: " +sid+"\t"+"sname: "+sname+"\t"+"Total marks: "+total);
	}
	

	public static void main(String[] args)
	{
		StudentAssignment stu1=new StudentAssignment();
		
		stu1.getStuMarks(97,98,99);
		stu1.getStuData(1001,"abc");
		stu1.totalMarks();
		
        StudentAssignment stu2=new StudentAssignment();
		
		stu2.getStuMarks(87,78,100);
		stu2.getStuData(1002,"xyz");
		stu2.totalMarks();
		
        StudentAssignment stu3=new StudentAssignment();
		
		stu3.getStuMarks(80,98,94);
		stu3.getStuData(1003,"def");
		stu3.totalMarks();
		
	}

}
