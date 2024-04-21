package guru.test.config.external.props;


import guru.springframework.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:testing.properties")
//@ContextConfiguration(classes = ExternalPropsEnvironment.class)
public class ExternalPropsEnvironment {
    @Autowired
    Environment environment;

    @Bean
    public FakeJmsBroker fakeJmsBrokerEnv(){

        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUrl(environment.getProperty("guru.jms.server"));
        fakeJmsBroker.setPort(environment.getRequiredProperty("guru.jms.port" , Integer.class));
        fakeJmsBroker.setUser(environment.getProperty("guru.jms.user"));
        fakeJmsBroker.setPassword(environment.getProperty("guru.jms.password"));

        return fakeJmsBroker;

    }
}
