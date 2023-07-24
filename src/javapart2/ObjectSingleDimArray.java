package javapart2;

public class ObjectSingleDimArray {

	public static void main(String[] args)
	{
		//In array we can store only same datatype of elements
		//(Homogeneous data types)To overcome this we use object class
		
		
		//To store different datatypes of elements(Heterogeneous data type)
        //by using Object class
	
		//By specifying size:(To store values with limits)
	 
	  /*Object a[]=new Object[5];
	    a[0]=10;
	    a[1]=20.5;
	    a[2]="welcome";
	    a[3]='G';
	    a[4]=true;*/
		
		
		//Without specifying size:(To store values without limits)
		
		Object a[]= {100,345.678,"java",'S',true,490,50.76};
	    
	    //As we are reading values of different datatypes we have to declare 
		//'i' with Object class
	    for(Object i:a)
	    {
	    	
	    	System.out.println(i);
	    }
	  

	}

}
