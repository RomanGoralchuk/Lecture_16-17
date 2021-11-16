package by.itacademy.javaenterprise.goralchuk.dao.implementation;

import by.itacademy.javaenterprise.goralchuk.dao.PetDao;
import by.itacademy.javaenterprise.goralchuk.entity.Pet;
import by.itacademy.javaenterprise.goralchuk.entity.PetType;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public class PetDaoImpl implements PetDao {
    @Override
    public Pet get(Serializable id) throws SQLException {
        return null;
    }

    @Override
    public Pet save(Pet pet) throws SQLException {
        return null;
    }

    @Override
    public void update(Pet pet) throws SQLException {

    }

    @Override
    public int delete(Serializable id) throws SQLException {
        return 0;
    }

    @Override
    public List<Pet> findAllEntity() throws SQLException {
        return null;
    }

    @Override
    public List<Pet> getAllPetByType(PetType petType) throws SQLException {
        return null;
    }
}
