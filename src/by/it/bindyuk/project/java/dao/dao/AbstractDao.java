package by.it.bindyuk.project.java.dao.dao;

import by.it.bindyuk.project.java.dao.ConnectionCreator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDao {

    //==================================================================================================================
    //метод для SOLID, получаем id из бина
    protected long executeCreate(String sql) throws SQLException {

        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {

            if (statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS) == 1) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getLong(1);
                }
            }
        }
        return -1;
    }

    //==================================================================================================================
    //метод для SOLID, узнаем, был ли изменен бин
    protected boolean executeUpdate(String sql) throws SQLException {

        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            System.out.println(sql);
            return (statement.executeUpdate(sql) > 0);
        }
    }
}
