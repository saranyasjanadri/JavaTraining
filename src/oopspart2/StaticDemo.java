package oopspart2;

   /*Static methods can access only static stuff,
     means only static methods & static variables
     (directly- without creating an object)*/
 
public class StaticDemo
{
	static int a=10;
	int b=20;
	int c=30;
	
	
  /*5-->This also same like main method so we have to create objects to
        access non static stuffs like b & c*/
	static void m1()
	{
		StaticDemo st=new StaticDemo();
		System.out.println(st.c);
		System.out.println("This m1 is static method");
	}
	
	/*5-->Always create objects from the main method not outside of it,
	  becoz the above approach is syntactically correct 
	  but its not a best practice*/
	
	
	
	
	
	void m2()
	{
		System.out.println("This m2 is non static method");
	}
	
	
	
	
	
	/*4-->Non static methods can access both static 
	  & non static stuff directly without creating any objects*/
	
	void m3() //Non static method
	{
		System.out.println("This m3 is non static method ");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		// accessed both static and non static stuff directly
		
	}

	
	
	
	
	
	
	public static void main(String[] args) 
	{
		/* 1-->main method is static so it can access 
		  static methods & variables directly without creating objects*/
		
		System.out.println(a);
		m1();
		
		
		
		
		//2-->This is not valid becoz b & m2 are non static.
	    
		//System.out.println(b); 
		//m2(); 
		
		//2-->static methods can also access non static stuff 
		//but only through creating objects for the class
		
		StaticDemo st=new StaticDemo();
		System.out.println(st.b);
		st.m3();
		
		
		 				
		
		/*3-->If main method is present in another class then 
		also we can access static stuffs directly without creating objects
	    by just specifying the class name*/
		
		
		/*System.out.println(StaticDemo.a);
		StaticDemo.m1();*/
		
		}

}
