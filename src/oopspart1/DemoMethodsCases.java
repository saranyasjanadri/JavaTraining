package oopspart1;

public class DemoMethodsCases 
{
	//Default or initial values for an variable/Initialitation of variables
			int x=10;
			int y=20;
			

	//Case1:Not taking parameters & also not return any values
			/*void sum()
			{
				System.out.println(x+y);
			}*/
	
			
			
	//Case2:Not taking parameters but return values
			/*int sum()
			{
				return (x+y);
			}*/
			
			
			
	//Case3:Taking parameters but not return any values
			/*void sum(int a,int b)
			{
				System.out.println(a+b);
			}*/
	
			
			
	//Case4:Taking parameters & also return values
			int sum(int a, int b)
			{
				return (a+b);
			}
	
	
			
	public static void main(String[] args)
	{
		
	DemoMethodsCases cal=new DemoMethodsCases();
	
	
	//Case1
	//cal.sum();
	
	
	
	//Case2
	/*int res=cal.sum();
	System.out.println(res);
	System.out.println(cal.sum());//both are valid*/
	
	
	
	//Case3
	//cal.sum(100,200);
	
	
	
	
	//Case4
	int res=cal.sum(200,200);
	System.out.println(res);
	System.out.println(cal.sum(100,200));//both are valid
	
	

	}

}
