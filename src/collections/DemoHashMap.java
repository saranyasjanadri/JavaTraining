package collections;
import java.util.HashMap;
import java.util.Map;

/*One of the Use case for HashMap is for testing with different 
 user name & password in Selenium*/

public class DemoHashMap {

	public static void main(String[] args)
	{
		
		
	//To declare an HashMap
		
	/*case1-->Declaration of any data types of pairs.Here 1st key can 
	  be one data type & 2nd key can be another data type.As well as
	  one value can be one data type & another value can be another 
	  data type.But the key should be unique values may duplicate */
	
	//HashMap hm=new HashMap();
		
		
	/*case2-->Declaration of all keys in the same data type &
	 all values in the same data type like this.*/
	
	HashMap <Integer,String> hm=new HashMap <Integer,String>();
		
		
		
		
	
		
	//To Add pairs into HashMap
		
	/*Here 101 is key & John is value. In the HashMap the data will
	  be stored in the (key,value)pair format.Here keys are unique 
	  but the values of the pair can be duplicated.
	  Here we cannot insert an pair in the middle,becoz we dont have index
	  format in the HashMap like ArrayList.
	  If we add any pair it will be added only in the end.*/
		
		hm.put(101, "John");
		hm.put(102, "Priya");
		hm.put(103, "Simon");
		hm.put(104, "Shreya");
		hm.put(105, "Raj");
		System.out.println(hm);//Prints all the pairs
		
		
		
		
		
		
		
		//To remove pair from HashMap
		hm.remove(103);
		System.out.println("After removing a pair:"+hm);
		
	   
		
		//case1-->To print the pairs	
	      System.out.println(hm);
		
	   //case2-->To read the pairs using for loop
		
	
	  /*hm.entrySet();This will return a complete pair from the HashMap.
	  To store it in any variable like[m=hm.entrySet()]then 
	  the variable should be (map.Entry) type.It stores both id & value.
	  To retrieve only id -->m.getKey()method is used &
	  to retrieve only value-->m.getValue()method is used */
		
	  for(Map.Entry m:hm.entrySet())
	  {
		  
		  System.out.println(m.getKey()+" "+m.getValue());
		  
	  }
		

	}

}
