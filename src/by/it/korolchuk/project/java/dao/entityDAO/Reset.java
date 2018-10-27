package by.it.korolchuk.project.java.dao.entityDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Reset {

    static String url = "jdbc:mysql://127.0.0.1:2016/" +
            "?useUnicode=true&characterEncoding=UTF-8";
    static String user = "root";
    static String password = "";


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver: " + e);
        }


        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement())
        {
            statement.executeUpdate("DROP TABLE IF EXISTS `korolchuk`.`ads` ;");
            statement.executeUpdate("DROP TABLE IF EXISTS `korolchuk`.`users` ;");
            statement.executeUpdate("DROP TABLE IF EXISTS `korolchuk`.`roles` ;");
            statement.executeUpdate("DROP SCHEMA IF EXISTS `korolchuk` ;");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
