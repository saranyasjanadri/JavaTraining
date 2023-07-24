package oopspart1;


// This program contains only class not main method
  /*We cannot execute this class without main class but we can share
    this class or use this class in other classes*/

public class EmployeeGeneric 
{
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}
}
