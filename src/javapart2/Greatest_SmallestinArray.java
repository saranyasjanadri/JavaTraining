package javapart2;

public class Greatest_SmallestinArray {

	public static void main(String[] args) 
	{
		int array[]={40,10,50,100,80,5,320,0};
		int i;
		int min=array[0];
		int max=array[0];
		
		//Finding greatest number in an array
		for(i=1;i<array.length;i++)
		{
			if(array[i]>max)
			max= array[i];
			
		}
		
		System.out.println("The greatest number in the array is: " +max);
		
		
		//Finding the smallest number in an array
		for(i=1;i<array.length;i++)
		{
			if(array[i]<min)
			min= array[i];
					
		}
				
		System.out.println("The smallest number in the array is: " +min);
				

		

	}

}
