package by.itacademy.javaenterprise.goralchuk.dao.implementation;

import by.itacademy.javaenterprise.goralchuk.dao.PetDao;
import by.itacademy.javaenterprise.goralchuk.entity.Pet;
import by.itacademy.javaenterprise.goralchuk.entity.PetType;
import by.itacademy.javaenterprise.goralchuk.util.HibernateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class PetDaoImpl implements PetDao {
    private static final Logger logger = LoggerFactory.getLogger(PetDaoImpl.class);
    private EntityManager em;

    @Override
    public Pet find(Long id) {
        em = HibernateUtil.getEntityManager();
        Pet pet = em.find(Pet.class, id);
        if (pet == null) {
            logger.error(new IllegalArgumentException("(" + id + ") -This value does not exist in the database.").getMessage());
        } else {
            logger.info("Operation completed");
        }
        return pet;
    }

    @Override
    public boolean save(Pet pet) {
        em = HibernateUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(pet);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            logger.error("Transaction failed " + e.getMessage(), e);
            return false;
        } finally {
            em.close();
        }
    }

    @Override
    public boolean update(Pet petNew) {
        em = HibernateUtil.getEntityManager();
        if (petNew != null) {
            try {
                Pet petOld = em.find(Pet.class, petNew.getId());
                try {
                    em.detach(petOld);
                    if (petNew.getName() != null){
                        petOld.setName(petNew.getName());
                    }
                    if (petNew.getType() != null){
                        petOld.setType(petNew.getType());
                    }
                    if (petNew.getBirthday() != null){
                        petOld.setBirthday(petNew.getBirthday());
                    }
                    em.getTransaction().begin();
                    em.merge(petOld);
                    em.getTransaction().commit();
                    return true;
                } catch (Exception e) {
                    em.getTransaction().rollback();
                    logger.error("Transaction failed " + e.getMessage(), e);
                    return false;
                } finally {
                    em.close();
                }
            } catch (IllegalArgumentException ex) {
                logger.error("No such object was found in the database", ex);
            }
        }
        logger.error(new NullPointerException("Method field cannot be empty").getMessage());
        return false;
    }

    @Override
    public boolean delete(Long id) {
        em = HibernateUtil.getEntityManager();
        Pet pet = em.find(Pet.class, id);
        if (pet == null) {
            logger.error(new IllegalArgumentException("(" + id + ") -This value does not exist in the database.").getMessage());
            return false;
        } else {
            try {
                em.getTransaction().begin();
                em.remove(pet);
                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
                logger.error("Transaction failed " + e.getMessage(), e);
                return false;
            } finally {
                em.close();
            }
            logger.info("\n Object " + pet + " deleted");
            return true;
        }
    }

    @Override
    public List<Pet> findAllEntity() {
        em = HibernateUtil.getEntityManager();
        try {
            List<Pet> list = em.createQuery("from Pet").getResultList();
            return list;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    @Override
    public List<Pet> getAllPetByType(PetType petType) {
        em = HibernateUtil.getEntityManager();
        try {
            List<Pet> list = em.createQuery("from Pet where type = ?1")
                    .setParameter(1, petType)
                    .getResultList();
            return list;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }
}
