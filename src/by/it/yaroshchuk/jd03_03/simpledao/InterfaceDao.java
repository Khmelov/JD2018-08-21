package by.it.yaroshchuk.jd03_03.simpledao;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceDao<TYPE> {
    TYPE read(long id) throws SQLException;

    boolean create(TYPE entity) throws SQLException;

    boolean update(TYPE entity) throws SQLException;

    boolean delete(TYPE entity) throws SQLException;

    List<TYPE> getAll() throws SQLException;

    List<TYPE> getAll(String whereAndOder) throws SQLException;
}
