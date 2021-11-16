package by.itacademy.javaenterprise.goralchuk.dao.implementation;

import by.itacademy.javaenterprise.goralchuk.dao.PeopleDao;
import by.itacademy.javaenterprise.goralchuk.entity.People;
import by.itacademy.javaenterprise.goralchuk.entity.Pet;
import by.itacademy.javaenterprise.goralchuk.entity.PetType;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public class PeopleDaoImpl implements PeopleDao {

    @Override
    public People get(Serializable id) throws SQLException {
        return null;
    }

    @Override
    public People save(People people) throws SQLException {
        return null;
    }

    @Override
    public void update(People people) throws SQLException {

    }

    @Override
    public int delete(Serializable id) throws SQLException {
        return 0;
    }

    @Override
    public List<People> findAllEntity() throws SQLException {
        return null;
    }

    @Override
    public List<People> getAllPeopleByPetType(PetType petType) throws SQLException {
        return null;
    }
}
