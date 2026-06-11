package CRUD;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class Insert {
    public static void insert(){
        Connection con = ConnectionUtil.getDbConnection();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter account id");
        int accid  = sc.nextInt();

        System.out.println("enetr name");
        String name = sc.next();

        System.out.println("enter balance");
        int balance = sc.nextInt();

        String sqlIn = "insert into bank values(???)";

        try{
            PreparedStatement pstmt = con.prepareStatement(sqlIn);
            
            pstmt.setInt(1,accid);
            pstmt.setString(2,name);
            pstmt.setInt(3,balance);

            int rowsInserted = pstmt.executeUpdate();

            if(rowsInserted >0){
                System.out.println("student record inserted");
            }
            pstmt.close();
            sc.close();
            con.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
