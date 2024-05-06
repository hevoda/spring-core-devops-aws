package guru.springframework.bootstrap.profilesysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultProfilesSysOut {

    public DefaultProfilesSysOut(){

        System.out.println("#########################################");
        System.out.println("#########################################");
        System.out.println("####              DEFAULT            ####");
        System.out.println("#########################################");
        System.out.println("#########################################");

    }
}
