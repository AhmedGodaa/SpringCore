package net.godaa.DependencyInjection.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dependency.xml");
        Model model = applicationContext.getBean("model", Model.class);
        System.out.println(model.getModelDao());


    }
}
