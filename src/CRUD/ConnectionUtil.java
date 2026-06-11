package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    public static Connection getDbConnection(){

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
            return con;


        }catch(SQLException e){
            System.out.println("oops something is wrong");
            e.printStackTrace();
        }
        //this ensures that method alwasy return a value 
        return null;
        //as the retunr type is connection but no connection is returned then java is not coing to compile and will give an error 

        //public      -> access modifier
        //static      -> belongs to class
        //Connection  -> return type
        //getConnection -> method name

    }
    
}

//Note: the insert, update, delete is the DAO 
