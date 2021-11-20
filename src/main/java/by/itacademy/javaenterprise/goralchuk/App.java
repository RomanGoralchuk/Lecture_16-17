package by.itacademy.javaenterprise.goralchuk;

import by.itacademy.javaenterprise.goralchuk.dao.implementation.PetDaoImpl;
import by.itacademy.javaenterprise.goralchuk.entity.Pet;
import by.itacademy.javaenterprise.goralchuk.entity.PetType;
import by.itacademy.javaenterprise.goralchuk.util.FlywayUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

/*        FlywayUtil.cleanMigration();
        FlywayUtil.updateMigration();*/

        PetDaoImpl petDao = new PetDaoImpl();
/*        System.out.println(petDao.find(2L));
        System.out.println(petDao.findAllEntity());
        System.out.println(petDao.getAllPetByType(PetType.DOG));*/

        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("dsfsdfdsfds");
        pet.setType(PetType.FROG);
        pet.setBirthday(java.sql.Date.valueOf("1012-11-13"));
        petDao.update(pet);

        Pet pet2 = new Pet();
        pet2.setId(2L);
        pet2.setName("dfdf");
        petDao.update(pet2);

        pet2.setName("fjsdhfjkdfhsdkjfhsdkjf");
        petDao.update(pet2);


        /*            petDao.delete(1L);*/


    }
}