package net.godaa.BeanFactory;

import net.godaa.BeanFactory.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

//        BeanFactory factory1 = new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService1 = (EmailService) factory1.getBean("emailService");
//        emailService1.sendEmail("Ahmed");

//        ApplicationContext factory2 = new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService2 = (EmailService) factory2.getBean("emailService");
//        emailService2.sendEmail("Ahmed");


//        ApplicationContext factory3 = new FileSystemXmlApplicationContext("spring.xml");
//        EmailService emailService3 = (EmailService) factory3.getBean("emailService");
//        emailService3.sendEmail("Ahmed");


//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        EmailService emailService = context.getBean("emailService", EmailService.class);
//        System.out.println(emailService);
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService = context.getBean("emailService", EmailService.class);
//        EmailService emailService1 = context.getBean("emailService", EmailService.class);
//        System.out.println(emailService);
//        System.out.println(emailService1);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = context.getBean("emailService", EmailService.class);
        EmailService emailService1 = context.getBean("emailService", EmailService.class);
        System.out.println(emailService);
        System.out.println(emailService1);


    }
}