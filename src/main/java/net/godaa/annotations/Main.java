package net.godaa.annotations;

import net.godaa.BeanFactory.EmailService;
import net.godaa.BeanFactory.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        we parse AppConfiguration cause it responsible for returning the opjects
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        SMSService smsService = context.getBean(SMSService.class);
        smsService.sendMessage("Hello Every One");

    }
}
