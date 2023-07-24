package javapart2;

public class Two_MultiDimArray {

	public static void main(String[] args)
	{
		//Declaration of array by specifying size
		
	  /*int a[][] = new int[3][2];// int[][]a = new int [3][2];is also valid.
	       //Here 3 is the no of rows & 2 is the no of columns
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		
		
		
		
		//Declaration of array without specifying size
		
		int a[][]= { {100,200},{300,400},{500,600},{700,800} };
		
		
		
		
		
		//Finding number of rows:
		
		System.out.println("Number of rows: " +a.length);//gives no of rows
		
		
		
		//Finding number of columns:
		//We can specify any row number present in the array to find the 
		//number of columns.For all same answer we will get
		
	   //System.out.println("Number of columns: " +a[1].length);
	   //System.out.println("Number of columns: " +a[2].length);
		 System.out.println("Number of columns: " +a[0].length);//gives no of columns
		
		
		
		
		
		
		//To read all the values using classic for loop
		System.out.println("Values in the array: ");
		
		/*for(int i=0;i<a.length;i++)//incrementing the rows
		{
			for(int j=0;j<a[i].length;j++)//incrementing the columns in the specified row
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}*/
		
		
		
		
		
		//To read all the values using Enhanced for loop
		
		for(int r[]:a)//r[] stores each row values from a one by one
		{
			for(int i:r)//i reads the values from the r[]
			{
				System.out.print(i + " ");
			}
			
			System.out.println();
		}
		
	

	}	

}
