package guru.springframework.test.config;


import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@Configuration
@ComponentScan("guru.springframework.test.ds")
public class DataSourceConfig {
}
