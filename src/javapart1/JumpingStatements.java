package javapart1;

//Jumping Statements --> break & continue
public class JumpingStatements 
{
	public static void main(String[] args)
	{
		
		/*for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break; //jump out of the loop without even executing the
				       // given number in if
			}
			
		System.out.println(i);

		}*/
		
		
		
		
		/*for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skips the particular number given number in if
				         //and continues the remaining condition
			}
			
		System.out.println(i);

		}*/
		
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==5 ||i==7)
			{
				continue;
			}
			
		System.out.println(i);

		}
		
		

	}

}
