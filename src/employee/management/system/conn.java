package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn { //connection class

    Connection connection;
    Statement statement;

    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");// load driver
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanegementsystem","root","pani@107");//actual connection
            statement = connection.createStatement();// statement creation

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
