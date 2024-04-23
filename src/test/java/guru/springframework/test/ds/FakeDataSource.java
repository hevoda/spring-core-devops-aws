package guru.springframework.test.ds;


import org.springframework.stereotype.Component;

@Component
public interface FakeDataSource {
    String getConnectionInfo();
}
