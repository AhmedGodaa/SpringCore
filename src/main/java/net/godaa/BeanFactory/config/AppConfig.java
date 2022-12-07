package net.godaa.BeanFactory.config;

import net.godaa.BeanFactory.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public EmailService emailService(){
        return new EmailService();
    }
}

