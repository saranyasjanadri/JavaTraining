package collections;
import java.util.ArrayList;



/*ArrayList comes under Derived Data types or Collections Framework. 
  To overcome the limitations of normal array, these collection types 
  are used 
  1)No fixed size for the array(Its growable in nature)
    We can increase or reduce the size in run time.
  2)We can store Homogeneous & Heterogeneous data types
  3)Underlying data structure is available so we implement the readymade
  methods*/

public class DemoArrayList
{
	public static void main(String args[])
	{
		
	//To declare ArrayList
	
	//case1-->We can store any data type of elements(Heterogeneous data)
	
	ArrayList list=new ArrayList();
	

		
	/*case2-->We can store only specific data type of elements
	          (Homogeneous data types)
	Here ArrayList is an pre defined class and list is the object or 
	  name of the array list*/
	
	//ArrayList <Integer> list=new ArrayList <Integer>();
	 
	 //ArrayList <String> list=new ArrayList <String>();
	
	
	
	
	
	//To add elements/values to Array list
	//By using add method we can add values to the Array list
	
       list.add("John");
       list.add("David");
       list.add("Scott");
       list.add("Smith");
       list.add(100);
       list.add('A');
       
       
      //To read values from the Array list 
      //case 1:
   
       //System.out.println(list);
         
   
	  //case 2:Using Enhanced for loop to read same data type of elements
  
      /* for(String s:list)
       {
    	   System.out.println(s);
       }*/
       
       
       
    /*case 3:Using Enhanced for loop to read different data type of 
     elements.
     Here Object type variable can hold any data type of elements*/
     
            
       for(Object s:list)//create s as the object type of variable
       {
    	   System.out.println(s);
       }
   
       
       
       
	
	//To find the size of arrayList
       
    System.out.println(list.size());//Gives size 
    System.out.println("Before removing:"+list);//Gives all the elements in the array
       
       
       
       
    //To remove elements/values from array list
       list.remove(1);//Removes David
       System.out.println(list.size());
       System.out.println("After Removing:"+list);
       
       
    //To insert a new element into the array list in the specified location
    /*If we add element with just add method it adds it in the current
      last position.But if we want to add the element in the particular position
      we need we have to specify with the index number and the new name*/
       
       
       list.add(1,"Jack");
       System.out.println(list.size());
       System.out.println("After Inserting:"+list);
       
     
      
	
	}
}
