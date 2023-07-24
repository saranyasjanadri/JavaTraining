package oopspart2;

public class finalVariable 
{
       int speed = 40;
       
       //final variable value cannot be changed.It remains constant
       //we cannot reassign the final variable anywhere
       final int speed1=80;

	public static void main(String[] args)
	{
		
     finalVariable fv=new finalVariable();
     
     //we can reassign the variable anywhere without final keyword
     fv.speed=100;
     System.out.println(fv.speed);
     
    
     
     finalVariable fv1=new finalVariable();
    
     //we cannot reassign the final variable anywhere
     fv1.speed1=100; //compile time error
     System.out.println(fv1.speed1);
     
     
     
     
	}

}
