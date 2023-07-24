package oopspart2;

/* Overriding should be achieved only through the inheritance ,
   ie)we must have atleast 2 classes
   We should not change the definition of the methods but only we have to 
   change the body of the methods*/

class Bank
{
	double rateOfInterest()
	{
		return 0;
	}
}



class SBI extends Bank
{
	double rateOfInterest()
	{
		return 10.5;
	}
}



class ICICI extends Bank
{
	double rateOfInterest()
	{
		return 9.7;
	}
}



class AXIS extends Bank
{
	double rateOfInterest()
	{
		return 8.5;
	}
}




public class MethodOverriding {

	public static void main(String[] args)
	{
	
	SBI sbi=new SBI();
	System.out.println(sbi.rateOfInterest());
	
	ICICI icici=new ICICI();
	System.out.println(icici.rateOfInterest());
	
	AXIS axis=new AXIS();
	System.out.println(axis.rateOfInterest());
	
	}

}
