package by.itacademy.javaenterprise.goralchuk.dao.implementation;

import by.itacademy.javaenterprise.goralchuk.dao.PeopleDao;
import by.itacademy.javaenterprise.goralchuk.entity.People;
import by.itacademy.javaenterprise.goralchuk.entity.Pet;
import by.itacademy.javaenterprise.goralchuk.entity.PetType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;

public class PeopleDaoImpl implements PeopleDao {
    private static final Logger logger = LoggerFactory.getLogger(PeopleDaoImpl.class);
    private EntityManager entityManager;

    @Override
    public People find(Long id) throws SQLException {
        return null;
    }

    @Override
    public boolean save(People people) throws SQLException {
        return true;
    }

    @Override
    public boolean update(People people) throws SQLException {
        return true;
    }

    @Override
    public boolean delete(Long id) throws SQLException {
        return true;
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
