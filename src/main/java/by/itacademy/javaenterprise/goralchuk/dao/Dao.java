package by.itacademy.javaenterprise.goralchuk.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {
    T get(Serializable id) throws SQLException;

    T save(T t) throws SQLException;

    void update(T t) throws SQLException;

    int delete(Serializable id) throws SQLException;

    List<T> findAllEntity() throws SQLException;
}
