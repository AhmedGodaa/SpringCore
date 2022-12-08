package net.godaa.JavaConfig;

import net.godaa.BeanLifeCycle.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration

public class AppConfig {
    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Person person() {
        return new Person();

    }

}
