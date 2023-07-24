package accessModifiers1;

/*Access modifiers: Define the scope of variables & methods
  Priority increases from lower to upper as like 
  private, default,protected & public*/


/*private access modifier is accessible only within the class.
  Generally private is not required. it can be used only in the case 
  of restricted*/
class A
{
	private int data=10;
	private void m1()
	{
		
	}
}




 /*If we don't use any modifier, it is treated as default.
 The default modifier is accessible only within the package,
 ie)across all the classes within the package */
 class B
 {
	/*by default here it takes default access modifier,so we can create 
	 object from main method and can access these */
    int data=10;
	void m2()
	{
		System.out.println(data);
	}
 }

 
 
 
 
public class Simple 
{
	
/*The protected access modifier is accessible within package normally
  and outside the package through only inheritance*/
    protected int data=10;
	protected void m3()
	 {
		System.out.println(data);
	 }
	
	
/*Public access modifier can be accessible from everywhere within or outside 
  the package even without inheritance*/		
	 public  int data1=10;
     public  void m4()
		{
			System.out.println(data1);
		}
		
	

 
	public static void main(String[]args)
	{
		/*A aobj=new A();
		aobj.data=20;//Compile time error
		aobj.m1();//Compile time error*/
		
		B bobj=new B();
		bobj.data=30;
		bobj.m2();
		
	}
	

}
