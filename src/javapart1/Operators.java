package javapart1;

public class Operators
{
	public static void main(String[] args)
	{
	int a=10;
	int b=20;
	
	
	//Here,Operands --> a & b
	//Arithmetic Operators --> = +,-,*,/,%
	System.out.println("Arithmetic Operators:");
	
	System.out.println("Sum of a and b is:"+ (a+b));
	System.out.println("Diff of a and b is:"+ (b-a));
	System.out.println("Mul of a and b is:"+ (a*b));
	System.out.println("Div of a and b is:"+ (a/b));//gives Quotient
	System.out.println("Mod of a and b is:"+ (a%b));//gives Remainder
	
	
	
	
	
	
	
	
	System.out.println("\n");
	//Relational operators(Comparision operators)--> == ,<,>,<=, >=,!=
	//Always returns boolean value
	System.out.println("Relational Operators:");
	
	System.out.println(a==b);
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a>=b);
	System.out.println(a<=b);
	System.out.println(a!=b);
	
	
	
	
	
	
	
	System.out.println("\n");
	//Logical operators &&, || ,!
	//Works between two boolean values 
	System.out.println("Logical Operators:");
	
	boolean x=true;
	boolean y=false;
	
	System.out.println(x && y);//It returns true only when both the values are true.
	System.out.println(x || y);//It returns true when either any one value is true.
	System.out.println(!x);//Returns the opposite value of x
	System.out.println(!y);//Returns the opposite value of y
	
	
	
	
	
	
	
	
	
	
	System.out.println("\n");
	//Assignment operators ---> =, +=, /=, *=, -=
	System.out.println("Assignment Operators:");
	int c;
	
	c=a;
	System.out.println(c);
	c=b;
	System.out.println(c);
	c+=5;//Increments the c value by 5
	System.out.println(c);
	c-=5;//Decrements the c value by 5
	System.out.println(c);
	c*=5;//Multiplies the c value by 5
	System.out.println(c);
	c/=5;//Decrements the c value by 5
	System.out.println(c);
	c%=5;//Decrements the c value by 5
	System.out.println(c);
	
	
	
	
	
	
	
	System.out.println("\n");
	//Increment/Decrement operators --> ++, --
	System.out.println("Increment/Decrement Operators:");
	
	a=20;
	System.out.println(a);	
	
	a++;  //a=a+1;
	System.out.println(a);	
	
	b=30;
	b--;  //b=b-1;
	System.out.println(b);	
	
	
	
	
	
	
	
	System.out.println("\n");
	//Difference between Post-increment & Pre-increment
	System.out.println("Post/Pre incrementing:");
	
	int a1, b1;
	
	
	//The operator's position before or after the variable name does
	//not make any difference  
  
	a1=2;
    a1++;
	System.out.println(a1);
	
    a1=2;
    ++a1;
	System.out.println(a1);
		
	
	/*But the position of ++ can make a difference when you are reading the 
	  value of the variable in the same statement.*/
	 
	
	/*Post-increment-->The assignment operator = takes precedence over
	  the post increment a1++.The value of a1 is assigned to b1 before
	  incrementing a1.*/
	 
	 a1=1;
	 b1=a1++;
	 System.out.println(b1);//prints 1
	
	
	
	/*Pre-increment-->With the pre-increment ++a1,the increment ++ takes
	  precedence over the assignment operator =,so the value of a1 is 
	  assigned to b1 after incrementing a1.*/
	 
	 a1=1;
	 b1=++a1;
	 System.out.println(b1);//prints 2
	
	
	
	}

}
