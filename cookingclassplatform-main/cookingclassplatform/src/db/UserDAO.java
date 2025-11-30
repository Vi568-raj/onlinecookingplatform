package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Admin;
import models.Student;
import models.User;

public class UserDAO {

    public User login(String username, String password) {
        String sql = "SELECT username, password, role FROM users WHERE username = ? AND password = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String role = rs.getString("role");
                    if ("admin".equalsIgnoreCase(role)) {
                        return new Admin(username, password);
                    } else {
                        return new Student(username, password);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
