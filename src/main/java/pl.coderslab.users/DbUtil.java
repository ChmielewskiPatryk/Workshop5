package pl.coderslab.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static String DB_URL = "jdbc:mysql://localhost:3306/workshop3?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private   static  String DB_USER = "root";
    private static String DB_PASS = "kacper123!";

    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL , DB_USER, DB_PASS);
        return conn;
    }
}
