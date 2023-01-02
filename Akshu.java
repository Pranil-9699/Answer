//calculator

import java.awt.*;
	import javax.swing.*;
public class calculator {
	

	
	 public static void main(String[] args) {
		    // create a new frame
		    JFrame frame = new JFrame("Calculator");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(250, 300);

		    // create a panel to hold the buttons and text field
		    JPanel panel = new JPanel();
		    panel.setLayout(new BorderLayout());
		    //  panel.setSize(10, 6);

		    // create a text field for displaying the result
		    JTextField resultField = new JTextField();
		    resultField.setEditable(true);
		    panel.add(resultField, BorderLayout.NORTH);

		    // create a panel to hold the buttons
		    JPanel buttonPanel = new JPanel();
		    buttonPanel.setLayout(new GridLayout(4, 4));

		    // create the buttons and add them to the button panel
		    String[] buttons = {"7", "8", "9", "/",
		                        "4", "5", "6", "*",
		                        "1", "2", "3", "-",
		                        "0", ".", "=", "+"};
		    for (String buttonLabel : buttons) {
		      JButton button = new JButton(buttonLabel);
		      buttonPanel.add(button);
		    }
		    panel.add(buttonPanel, BorderLayout.CENTER);

		    // add the panel to the frame
		    frame.add(panel);

		    // display the frame
		    frame.setVisible(true);
		  }
		}


//Arraylist Collection

import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
	
	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);

	    // Accept n integers from the user and store them in the ArrayList
	    System.out.print("Enter the number of integers: ");
	    int n = scanner.nextInt();
	    for (int i = 0; i < n; i++) {
	      System.out.print("Enter integer #" + (i+1) + ": ");
	      numbers.add(scanner.nextInt());
	    }

	    // Display the elements of the ArrayList
	    System.out.println("\nElements of the ArrayList:");
	    for (int number : numbers) {
	      System.out.println(number);
	    }
	  

}
}

// jdbc

package jdbc;
import java.sql.*;
public class Demo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emplyee","root","cheeku");	
		System.out.println("Connected");
       
		Statement st=con.createStatement();
		
       ResultSet rs=st.executeQuery("select * from faculty ");
        while (rs.next())
       {
        	int id=rs.getInt("fid");
        	String name=rs.getString("fname");
        	String qualification=rs.getString("Qualification");
        	int dep=rs.getInt("dep_id");
        	System.out.println(id+" "+name+" "+qualification+" "+dep);
       }
     st.executeUpdate("INSERT INTO facujlty"+"(fid,fname,Qualification,dep_id)"+"values(4,'Kanchan','MBBS',7)");
      System.out.println("insert");
      st.executeUpdate("update faculty set fid=7 where fname='prashant' ");
     System.out.println("update");
       st.executeUpdate("delete from faculty where fid=4");
       System.out.println("delete");
       
        st.close();
        con.close();
}
}
	

//reverse no

import java.util.*;
public class Reverse {
	public static void main(String args[])
	  {
	    int n, reverse = 0;

	    System.out.println("Enter an integer to reverse");
	    Scanner in = new Scanner(System.in);
	    n = in.nextInt();
	    

	    while(n != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + n%10;
	      n = n/10;
	    }

	    System.out.println("Reverse of the number is " + reverse);
	  }
	}


// prime no

import java.util.*;
public class Prime {
	

	
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter a number to check if it is truly prime number or not: ");
	        int n= sc.nextInt();
	        if(isPrime(n)) {
	            System.out.println(n + " is prime number");
	        }
	        else{
	            System.out.println(n + " is a non-prime number");
	        }
	    }
	    static  boolean isPrime(int num)
	    {
	        if(num<=1)
	        {
	            return false;
	        }
	       for(int i=2;i<=num/2;i++)
	       {
	           if((num%i)==0)
	               return  false;
	       }
	       return true;
	    }
}


//Fabonacci
public class Fabonacci {
	public static void main(String args[])  
	{    
	 int n1=0,n2=1,n3,i,count=10;    
	 System.out.print(n1+" "+n2);//printing 0 and 1    
	    
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	  
	}
}

//perfect no. using bufferreader class
import java.io.*;

public class Fabonacci {
	  public static void main(String[] args) throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("Enter a number: ");
	    int num = Integer.parseInt(reader.readLine());

	    int sum = 0;
	    for (int i = 1; i < num; i++) {
	      if (num % i == 0) {
	        sum += i;
	      }
	    }

	    if (sum == num) {
	      System.out.println(num + " is a perfect number");
	    } else {
	      System.out.println(num + " is not a perfect number");
	    }
	  }
	}


//maximum number
import java.io.*;

public class Fabonacci {
      public static void main(String[] args) throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("Enter the number of elements in the array: ");
	    int n = Integer.parseInt(reader.readLine());
	    int[] arr = new int[n];

	    for (int i = 0; i < n; i++) {
	      System.out.print("Enter element " + (i+1) + ": ");
	      arr[i] = Integer.parseInt(reader.readLine());
	    }

	    int max = arr[0];
	    for (int i = 1; i < n; i++) {
	      if (arr[i] > max) {
	        max = arr[i];
	      }
	    }

	    System.out.println("The maximum number in the array is: " + max);
	  }
	}




//click button


import javax.swing.*;
public class abc {
	
	
	public static void main(String args[]) {
	JFrame f = new JFrame();
	JButton b= new JButton("click");
	b.setBounds(90,100,100,40);
	f.add(b);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
	}
}
    	

