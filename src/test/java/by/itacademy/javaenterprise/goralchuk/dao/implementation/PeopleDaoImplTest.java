package by.itacademy.javaenterprise.goralchuk.dao.implementation;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PeopleDaoImplTest {
    private static final Logger logger = LoggerFactory.getLogger(PeopleDaoImplTest.class);

    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            logger.error("Test failed: " + description);
        }

        @Override
        protected void succeeded(Description description) {
            logger.info("Test successes: " + description);
        }
    };

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void get() {
    }

    @Test
    public void save() {
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