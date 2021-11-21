package by.itacademy.javaenterprise.goralchuk;

import by.itacademy.javaenterprise.goralchuk.dao.implementation.PeopleDaoImpl;
import by.itacademy.javaenterprise.goralchuk.dao.implementation.PetDaoImpl;
import by.itacademy.javaenterprise.goralchuk.entity.People;
import by.itacademy.javaenterprise.goralchuk.entity.Pet;
import by.itacademy.javaenterprise.goralchuk.entity.PetType;
import by.itacademy.javaenterprise.goralchuk.util.FlywayUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        try {
            FlywayUtil.cleanMigration();
            FlywayUtil.updateMigration();
            PetDaoImpl petDao = new PetDaoImpl();
            PeopleDaoImpl peopleDao = new PeopleDaoImpl();
            logger.info("" + petDao.findAllEntity());
            logger.info("" + peopleDao.find(1L));
            petDao.delete(1L);
            System.out.println(peopleDao.getAllPeopleByPetType(PetType.CAT));
        } catch (StackOverflowError  e) {
            logger.error(e.getMessage(), e);
        }

    }
}