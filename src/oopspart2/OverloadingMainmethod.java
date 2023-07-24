package oopspart2;

public class OverloadingMainmethod 
{
	//These main methods can be in another classes
	 public void main(int x)
     {
    	 System.out.println(x);
     }
     
     public void main(int x,int y)
     {
    	 System.out.println(x+y);
     }
	public static void main(String[] args) 
	{
		OverloadingMainmethod om=new OverloadingMainmethod();
		om.main(100);
		om.main(100,200);

	}

}
