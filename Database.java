 
package Connections;
import java.sql.*;
public class person {

	public static void main(String[] args) throws Exception {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loaded");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mane","root","260502");	
				System.out.println("Connected");
		       
				Statement st=con.createStatement();
				
				
				 // Execute a query to create the student table
			     
			      String sql = "CREATE TABLE person (PID INTEGER NOT NULL, name VARCHAR(255) NOT NULL, gender VARCHAR(20) NOT NULL,birthyear VARCHAR(20) NOT NULL)";
			      st.executeUpdate(sql);
			      System.out.println("Person table created successfully");	
				
				
				 st.executeUpdate("INSERT INTO person"+"(PID,name,gender,birthyear)"+"values(4,'Smita','Female','2000')");
		      System.out.println("Values are Inserted");
		      
		      st.executeUpdate("INSERT INTO person"+"(PID,name,gender,birthyear)"+"values(1,'Pradnya','Female','2000')");
		      System.out.println("Values are Inserted");
		      
		      
		        ResultSet rs=st.executeQuery("select * from person ");
		        while (rs.next())
		       {
		        	int PID=rs.getInt("PID");
		        	String name=rs.getString("name");
		        	String gender=rs.getString("gender");
		        	String birthyear=rs.getString("birthyear");
		        	
		        System.out.println(PID+" "+name+" "+gender+"  "+birthyear);
		       }
		        
		        /*  st.executeUpdate("update student set id=5 where name='Kanchan' ");
			       System.out.println("update");
			       */
		        
		       
		        /*       st.executeUpdate("delete from student where id=5");
		       System.out.println("delete");
		       
		       
		      st.executeUpdate("INSERT INTO student"+"(id,name)"+"values(4,'Kanchan')");
	       System.out.println("hello");*/
		        st.close();
		        con.close();
		}
		
	}









package Connections;

import java.sql.*;

public class Employee {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mane","root","260502");	
		System.out.println("Connected");
		
		Statement st=con.createStatement();
		// Execute a query to create the student table
	     
	      String sql = "CREATE TABLE employee(ID INTEGER NOT NULL, name VARCHAR(255) NOT NULL, salary VARCHAR(20) NOT NULL)";
	      st.executeUpdate(sql);
	      System.out.println("Employee table created successfully");	
		
		
		 st.executeUpdate("INSERT INTO employee"+"(ID,name,salary)"+"values(4,'Smita','2000')");
    System.out.println("Values are Inserted");
    
    st.executeUpdate("INSERT INTO employee"+"(ID,name,salary)"+"values(1,'Pradnya','2000')");
    System.out.println("Values are Inserted");
    
    
      ResultSet rs=st.executeQuery("select * from employee");
      while (rs.next())
     {
      	int PID=rs.getInt("ID");
      	String name=rs.getString("name");
      	String salary=rs.getString("salary");
      	
      System.out.println(PID+" "+name+" "+"  "+salary);
     }
       
		

	}

}






package Connections;

import java.sql.*;

public class course {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mane","root","260502");	
		System.out.println("Connected");
		
		Statement st=con.createStatement();
		
		String sql = "CREATE TABLE course(code INTEGER NOT NULL, name VARCHAR(255) NOT NULL,department VARCHAR(20) NOT NULL,no_of_stud VARCHAR(20) NOT NULL)";
	      st.executeUpdate(sql);
	      System.out.println("Employee table created successfully");	
		
		
		 st.executeUpdate("INSERT INTO course"+"(code,name,department,no_of_stud)"+"values(121,'abc','BCA Science','999')");
  System.out.println("Values are Inserted");
  
  st.executeUpdate("INSERT INTO course"+"(code,name,department,no_of_stud)"+"values(122,'xyz','BBA ','998')");
  System.out.println("Values are Inserted");
  
  
  ResultSet rs=st.executeQuery("select * from course");
  while (rs.next())
 {
  	int code=rs.getInt("code");
  	String name=rs.getString("name");
  	String department=rs.getString("department");
  	String no_of_stud=rs.getString("no_of_stud");
  	
  System.out.println(code+" "+name+" "+"  "+department+""+no_of_stud);
 }
  
  st.executeUpdate("update course set no_of_stud='1000' where department='BCA Science'");
  System.out.println("update");
	
  ResultSet rs1=st.executeQuery("select * from course");
  while (rs1.next())
  {
   	int code=rs1.getInt("code");
   	String name=rs1.getString("name");
   	String department=rs1.getString("department");
   	String no_of_stud=rs1.getString("no_of_stud");
   	
   System.out.println(code+" "+name+" "+"  "+department+""+no_of_stud);
  }
		
		
	}

}
