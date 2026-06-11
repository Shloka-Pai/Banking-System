package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Remove {
    public static void Delete() {
        Connection con = ConnectionUtil.getDbConnection();
        if (con == null) {
            System.out.println("Failed to connect to the database.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No to delete: ");
        int rollNo = sc.nextInt();

        String sqlDelete = "delete from student where RollNo = ?";

        try (PreparedStatement pstmt = con.prepareStatement(sqlDelete)) {
            pstmt.setInt(1, rollNo);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Success! Deleted " + rowsDeleted + " row(s).");
            } else {
                System.out.println("No student found with Roll No: " + rollNo);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                sc.close();
            }
        }
    }
}
