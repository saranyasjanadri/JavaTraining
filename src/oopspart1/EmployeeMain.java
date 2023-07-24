package oopspart1;


//Main method present in seperate class
public class EmployeeMain {

	public static void main(String[] args) 
	{
		EmployeeGeneric emp2=new EmployeeGeneric();
		emp2.eid=102;
		emp2.ename="John";
		emp2.sal=55000.00;
		emp2.deptno=20;
		emp2.job="CEO";
		emp2.display();
		
		System.out.println();
		
		EmployeeGeneric emp3=new EmployeeGeneric();
		emp3.eid=103;
		emp3.ename="Priya";
		emp3.sal=45000.00;
		emp3.deptno=25;
		emp3.job="Developer";
		emp3.display();
		

	}

}
