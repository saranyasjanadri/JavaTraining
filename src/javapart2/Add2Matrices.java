package javapart2;

public class Add2Matrices {

	public static void main(String[] args)
	{
		int array1[][]= { {10,20,30},{30,40,50},{50,60,70}};
		int array2[][]= { {1,2,3},{3,4,5},{5,6,7}};
		
		int a=array1.length;//gives no of rows
		
		//gives no of columns,use any index no to get the no of columns
		int b=array1[0].length;
		
		int sum[][]=new int [a][b];
		
		
		
		
		//Calculating sum of two matrices
		System.out.println("Sum of two matrices: ");
		
		for (int c=0;c<a;c++)//To read the values of rows
		{
			for(int d=0;d<b;d++)//To read the values of columns
			{
				sum[c][d]=array1[c][d]+array2[c][d];//Replace '+' with '-' to subtract matrices
				System.out.print(sum[c][d] +"\t");
				
			}
			System.out.println();
		}
		
		

	}

}
