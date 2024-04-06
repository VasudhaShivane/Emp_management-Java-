package Employee;

import java.sql.*;

public class conn
{
    
    public Connection c;
    public Statement s;
 
    public conn()
    {
        try
        {
        	//to register mysql drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connecting to server and database
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root@123");
            //initialize statement
            s = c.createStatement();
        }
        catch(Exception e) 
        {
           // e.printStackTrace();
        }
    }
}
