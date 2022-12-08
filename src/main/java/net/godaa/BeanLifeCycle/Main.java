package net.godaa.BeanLifeCycle;

import net.godaa.annotations.AppConfiguration;
import net.godaa.annotations.SMSService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        String name = context.getBean("customerBean", Customer.class).getFirstname();
//        System.out.println(name);


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanLifecycleConfig.class);
        applicationContext.getBean(Customer.class);
        ((AbstractApplicationContext)applicationContext).registerShutdownHook();

//        context.getBean(Customer.class);
//         smsService = context.getBean(SMSService.class);
//        smsService.sendMessage("Hello Every One");

    }
}
