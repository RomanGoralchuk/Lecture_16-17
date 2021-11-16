package by.itacademy.javaenterprise.goralchuk.dao.implementation;

import by.itacademy.javaenterprise.goralchuk.dao.PeopleDao;
import by.itacademy.javaenterprise.goralchuk.entity.People;
import by.itacademy.javaenterprise.goralchuk.entity.PetType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public class PeopleDaoImpl implements PeopleDao {
    private EntityManager entityManager;
    private static final Logger logger = LoggerFactory.getLogger(PeopleDaoImpl.class);

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
