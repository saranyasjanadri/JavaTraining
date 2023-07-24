package javapart2;

public class SearchNumberinArray {

	public static void main(String[] args) 
	{
		int a[]= {000,100,3000,300,400,300,700,800,900,300};
		int search_number=300;
	    int i;
	    boolean x=false;
		
	    
	    //Linear Search -->To search specific number in an array
		for(i=0; i<a.length;i++)
		{
			if(a[i]==search_number)
			{
			x=true;
			System.out.println(search_number + " is present in the location "+ (i+1));
			//break;//If we give break it finds only the 1st occurrence
			        //of the no to be searched
			}
			
		
		}
		
		if(x==false)
		{
		System.out.println(search_number + " is not present in the array ");
		}
		
		
		
		
		/*Note:If our case is that the array contains each and every element
		       is different from others,then we can use this logic instead
		       of setting boolean x=false & true in the above logic &
		       have to use the break inside the 'if' block in the for loop*/
		//if(i==a.length)
		//System.out.println(search_number + " is not present in the array ");
		
	}

}
