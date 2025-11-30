package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL  = "jdbc:mysql://localhost:3306/cookingclassplatform";
    private static final String USER = "root";    // <--- apna MySQL Workbench username
    private static final String PASS = "iankit2005";    // <--- yaha apna MySQL password

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
