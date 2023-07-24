package oopspart3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*import java.io.FileNotFoundException;--->If IOException is not used we 
have to import this FileNotFoundException*/



public class ThrowsKeyword {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		
		FileReader fr=null;
	
	/*Here we given the file path which is not present.So the compiler 
	  identified & thrown Unhandled exception type FileNotFoundException &
	  given 2 suggestions for handling,from that select add throws 
	  declaration so it adds throws keyword an the exception class 
	  to the method where the statement present*/
		
		fr=new FileReader("C:\\Selenium\\Test.txt");
	
		
		
		
		
		BufferedReader bfr =new BufferedReader(fr);
		
	/*Here it throws IOException.But if we click and add the throws keyword 
	declaration as we mentioned  b4 it removes the FileNotFoundException
    and adds IOException in the method.Becoz IOException is the super class
    of FileNotFoundException.As FileNotFound is already the part of 
    IOException class,adding IOException is applicable for both the 
    statements */
		
		System.out.println(bfr.readLine());
		
		
		
		
		
	/*It throws InterruptedException. So if we click add throw it adds
	 this exception also to the method with comma as shown above */
		
		Thread.sleep(5000);
		
	}

}
