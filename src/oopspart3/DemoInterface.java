package oopspart3;

/*At the beggining level if we know the requirement but we don't know
  how to implement it we creates the interface.in future we have to 
  implement it whenever we get the design by using the class*/
 

      interface A
      {
    	//By default variables in interface is static & final
    	//By default methods in the interface is public
    	  int a=10; 
	
	    /*Abstract method ,by default its public,
	      only definition will be there no body*/
	
       void m1();  
       }

      
      
public class DemoInterface implements A
    {
	  
    /*Here if we don't specify any access modifier inside class, by default
    it takes it as (default).So u have to specify the same level access
    modifier as in the interface or higher level than that as public*/
    	
    	//Implementing the abstract method through the class
    	public void m1()
    	{
    		System.out.println(a);
    	}

public static void main(String[] args)
	{
	  /*The class and Interface doesn't create any memory until we create the
		object for it*/
		
		
	  /*DemoInterface din --is creating object variable 
	    new DemoInterface() --is instantiation part */
		
	  
		//1st way
		DemoInterface din =new DemoInterface();
		din.m1();
		
		
	  /* We can create the object variable for the interface name but we
		 can't instantiate it by the interface name*/
		 
	   //2nd way
		A din1 =new DemoInterface();
		din1.m1();
		
		
		
	}

}
