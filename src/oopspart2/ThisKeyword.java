package oopspart2;


/*To differentiate between class variables and method variables 
  'this' keyword is used*/

public class ThisKeyword
{
   int a,b;//instance variables or class variables
  
   
   void getvalues(int a,int b)//method variables /external variables
   {
	  this.a=a;//this keyword indicates class variables
	  this.b=b; 
   }
   
   
   void printValues()
   {
	   System.out.println(a);
	   System.out.println(b);
   }
   
   
	public static void main(String[] args)
	{
		ThisKeyword th=new ThisKeyword();
		th.getvalues(10,20);
		th.printValues();
		
	

	}

}
