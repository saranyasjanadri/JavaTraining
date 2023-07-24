package javapart2;


  /*Storing multiple values of same datatype in a single variable/entity 
    is called as array.
    Here few limitations are there,
  1)Array size is fixed(Not growable in nature)
    If we try to increase the size of the array in run time then it gives
    ArrayIndexOutOfBoundException.
    If we try to reduce the size then it is the waste of memory.
  2)We can store only same datatype of elements(Homogeneous data types)
  3)No underlying Data structure available so we cannot use any readymade
    methods like sort(), search().We have to write our own programming logic
    to perform operations on array*/

public class SingleDimArray {

	public static void main(String[] args)
	{
		
		
	/*Declaration of an array with specified  size 5,starting index is 0,
	  last index is 4*/
		 
	/*case1:-->To store different datatypes of elements
	           (Heterogeneous data type)by using Object class*/
		
		//Object a[]=new Object[5];
		  
		 
	//case2:-->To store specific data type of elements(Homogeneous data type)
		
		/*int a[] =new int[5]; // int[]a = new int[5]; is also same 
		
		//Storing/Inserting values into array
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		
		
		//Declaration of an array without specifying size to store
		//values without limits
		
		  int a[]= {100,200,300,400,500}; 
		
		
		
		
		
		//To find the length/size of an array
		
		//Here in a.length is an static variable not an method
		System.out.println("Length of an array is:  " +a.length);
		
		
		
		
		
		
		//To read an specific value from an array
		  System.out.println(a[2]);
		
		
		
		
		
	 /*To read all values from an array using classic for loop
	   can use i<=a.length-1 (ex:for size 5 array i<5 & i<=4 both are same)*/
		
		
	    /*for (int i=0;i<=a.length-1;i++)
		  {
			System.out.println(a[i]);
		  }*/
		
     
		
		
		
		
		
		/*To read values using Enhanced for loop or Advanced for loop
		 or for each loop. Use this while working with Arrays,Hashmap,
	     Arraylist*/
		
		 for(int i:a)
		 {
			System.out.println(i);
		 }
		
		
		 
	}

}
