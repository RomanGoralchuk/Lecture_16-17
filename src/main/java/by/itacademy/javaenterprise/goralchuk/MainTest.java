package by.itacademy.javaenterprise.goralchuk;
import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    private static final Logger logger = LoggerFactory.getLogger(MainTest.class);

    public static void main(String[] args) {

        Flyway flyway = Flyway.configure()
                .loadDefaultConfigurationFiles()
                .load();
        flyway.migrate();
    }
}
