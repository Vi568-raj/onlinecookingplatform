package db;

import java.sql.Connection;

public class DBTest {
    public static void main(String[] args) {
        try (Connection con = DBUtil.getConnection()) {
            System.out.println(" Connection successful!");
        } catch (Exception e) {
            System.out.println(" Connection failed:");
            e.printStackTrace();
        }
    }
}
