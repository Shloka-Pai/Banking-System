package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Update {
    public static void update(){
        Connection con = ConnectionUtil.getDbConnection();

        if(con == null){
            System.out.println("error");
            return;
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("enter acc id");
        int accid = sc.nextInt();

        System.out.println("enter name");
        String name = sc.nextLine();

        System.out.println("enter balance");
        int balance = sc.nextInt();

        String sqlUpdate = "update account set name=? balance=? where accid=?";

        try{
            PreparedStatement pstmt = con.prepareStatement(sqlUpdate);

            pstmt.setInt(1, accid);
            pstmt.setString(2, name);
            pstmt.setInt(3,balance);

            pstmt.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
            sc.close();
        }
    } 
}
