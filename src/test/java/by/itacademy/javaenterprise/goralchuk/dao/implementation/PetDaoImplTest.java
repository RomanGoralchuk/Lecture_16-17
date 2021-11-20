package by.itacademy.javaenterprise.goralchuk.dao.implementation;

import by.itacademy.javaenterprise.goralchuk.entity.Pet;
import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class PetDaoImplTest {
    private static final Logger logger = LoggerFactory.getLogger(PetDaoImplTest.class);
    private EntityManager eManager;
    private static EntityTransaction eTransaction;
    private PetDaoImpl petDao;

    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            logger.error("Test failed: " + e + description);
        }

        @Override
        protected void succeeded(Description description) {
            logger.info("Test successes: " + description);
        }
    };

    @BeforeClass
    public static void beforeClass() throws Exception {
        eTransaction = mock(EntityTransaction.class);
    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        eManager = mock(EntityManager.class);
        petDao = new PetDaoImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void get() throws SQLException {
       /* Pet pet = new Pet();
        pet.setId(4L);
        Long idForQuery = 4L;
        Mockito.when(eManager.find(Mockito.<Class<Pet>>any(), Mockito.eq(idForQuery))).thenReturn(pet);
        assertEquals(idForQuery, petDao.find(idForQuery).getId());*/
    }

    @Test
    public void save() {
/*        try {
            Pet pet = new Pet();
            pet.setPetType(PetType.CAT);
            pet.setAnimalName("Test");
            pet.setBirthday(java.sql.Date.valueOf("2013-09-04"));
            when(eManager.getTransaction()).thenReturn(eTransaction);
            int result = petDao.save(pet);
            assertEquals(1, result);
        } catch (SQLException e) {
            logger.error(e.toString());
        }*/
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
    public void getAllPetByType() {
    }
}