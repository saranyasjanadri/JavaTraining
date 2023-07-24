package javapart2;

public class ObjectMultiDimArray {

	public static void main(String[] args)
	{
	
		
	//Declaration of Object class multi dimensional array by specifying size
		Object a[][] =new Object[2][3];
		a[0][0]=100;
		a[0][1]=30.5;
		a[0][2]=true;
		
		a[1][0]='c';
		a[1][1]="java";
		a[1][2]=false;
		
		
		
		
	//Declaration of Object class multi dimensional array by without specifying size
		
		Object b[][] = {{1000,300.50,true},{'b',"java1",false}};
		
		//To read the values using for each loop
		for(Object r[]:b)
		{
			for(Object i:r)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		

	}

}
