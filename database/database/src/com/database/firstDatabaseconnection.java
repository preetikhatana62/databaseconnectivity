package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*org.h2.Driver
jdbc:h2:~/test
*/
public class firstDatabaseconnection {
	public static void main(String[] args) throws Exception {
		
	
	Class.forName("org.h2.Driver");
	Connection connection=DriverManager.getConnection("jdbc:h2:~/test","sa","123");
	String str="insert into employee tale(?,?,?_)";
    PreparedStatement prepare= connection.prepareStatement(str);
    prepare.setInt(1, 5);
    prepare.setString(2,"allen");
   int n=prepare.executeUpdate();
  if(n==1)
	  System.out.println("inserted");
  else
  System.out.println("not inserted");

}
}