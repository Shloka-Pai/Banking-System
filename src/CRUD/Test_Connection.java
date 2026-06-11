package CRUD;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Test_Connection {
    public static void show(){
        //public static void main(string[] args) is a special method 
        //it acts as an entry point for jvm so when jvm sees it it will implicitly call the function and execute 
        //show() is a normal method so u will have to call it

        //public static void main(string[] args){
        //show();
        //}
        try{
            //JDBC select query
            Connection con = ConnectionUtil.getDbConnection();

            String sql = "SELECT * FROM account";

            Statement stmt = con.createStatement();
            ResultSet rSet = stmt.executeQuery(sql);

            while(rSet.next()){
                while (rSet.next()) {
                    System.out.println(
                        rSet.getInt("account_id") + " "
                        + rSet.getString("account_name") + " "
                        + rSet.getDouble("balance"));
                }
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
    
}
