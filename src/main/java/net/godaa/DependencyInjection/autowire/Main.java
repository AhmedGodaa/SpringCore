package net.godaa.DependencyInjection.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Model model = applicationContext.getBean(Model.class);
        System.out.println(model.getModelDao());


    }
}
