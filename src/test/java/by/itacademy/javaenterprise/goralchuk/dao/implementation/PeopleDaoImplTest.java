package by.itacademy.javaenterprise.goralchuk.dao.implementation;

import by.itacademy.javaenterprise.goralchuk.entity.People;
import by.itacademy.javaenterprise.goralchuk.util.HibernateUtil;
import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PeopleDaoImplTest {
    private static final Logger logger = LoggerFactory.getLogger(PeopleDaoImplTest.class);
    private EntityManager eManager;
    private EntityTransaction eTransaction;
    private PeopleDaoImpl peopleDao;

    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            logger.error("Test failed: " + description , e);
        }

        @Override
        protected void succeeded(Description description) {
            logger.info("Test successes: " + description);
        }
    };

    @Before
    public void setUp() throws Exception {
        eManager = mock(EntityManager.class);
        eTransaction = mock(EntityTransaction.class);
    }

    @After
    public void tearDown() throws Exception {
        eManager.close();
    }

    @Test
    public void whenFindObjectById() {
        Long expectedId = 10L;
        People people = new People();
        people.setId(expectedId);
        peopleDao = new PeopleDaoImpl(eManager);
        when(eManager.find(People.class, expectedId)).thenReturn(people);
        assertEquals(people, peopleDao.find(expectedId));
        logger.info("11   " + people);
        logger.info("22   " + peopleDao.find(expectedId));
    }

    @Test
    public void whenSaveObjectToDatabase() {

    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void findAllEntity() {
    }

    @Test
    public void getAllPeopleByPetType() {
    }
}