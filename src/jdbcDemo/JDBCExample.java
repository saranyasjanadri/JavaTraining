package jdbcDemo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*Pre-requisite:
  1)Download database driver(.jar file)
  2)Add driver jar to your project */

/*Steps to write JDBC program:
  1)Create a connection
  2)Create a query/statement
  3)Execute statement/query
  4)Close connection*/

public class JDBCExample {

	public static void main(String[] args) throws SQLException
	{
	//To create a connection
		
		
	/*Connection is a predefined class, con is an object, 
	  DriverManager is an static class which contains the method 
	  getConnection().
	  DriverManager.getConnection()-->It may throw some Exception
	  so we throws SQLException to the method as above
	  
	  Syntax of url for Oracle database:
	  URL-->"jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr"
	  jdbc:oracle:thin:@--> this remains for all
	  localhost:1521/pdborcl-->IP Address or machine name where our
	  database server is stored
	  1521 is code number
	  pdborcl is service name
	  hr is username
	  hr is password  */
		
		
      //This connection class will establish the connection to the database
		
	  Connection con=DriverManager.getConnection(url);
	  
	  
	  
	  
	  //To create the query/statement
	  
	  /*Statement is the pre defined class,stmt is the object
	    con.createStatement()-->The statement is executes through connection,
	    so this will associate both stmt and con object*/
	  
	  Statement stmt=con.createStatement();
	  
	  
	  //These insert,delete,update query will not return any output
	
	  //Query for inserting values
	  String s ="Insert into student values(101,'Scott')";
	  
	  //Query for updating values
	  String s1="update student sname='KIM' where sid=105 ";
	  
	  //Query for deleting values
	  String s2="delete student where sid=105";
	  
      //Execute statement/query
	  
	  stmt.executeQuery(s);
	  
	  
	 
	  
	  
	  
	  //This select query will return back some output
	  
	  //Query for selecting and printing values
	  
	  String s3="select emp_id,first_name,last_name from employees";
	  
	  //Execute select query
	  /*ResultSet--> is the special class
	    rs -->is the recordset contains all the data returned by the 
	    select query*/
	  
	  ResultSet rs=stmt.executeQuery(s3);
	  
	  /*rs.next()-->method verifies the next record is present or not 
	   till the end*/
	  
	  while(rs.next())
	  {
		  int eid =rs.getInt("emp_id");
		  String fname=rs.getString("first_name");
		  String lname=rs.getString("last_name");
		  
		  System.out.println(eid+" "+fname+" "+lname);
		  
	  }
	  
	 
	  
	  
	  //Close the connection
	  con.close();
	  
	  
	  
	  
	  System.out.println("Program is completed");
	  
		
		}

}
