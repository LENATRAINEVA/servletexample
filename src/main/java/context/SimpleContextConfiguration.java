package context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleContextConfiguration {

    @Bean
    public ErrorClass helloWorld(){
        return new ErrorClass();
    }

}
