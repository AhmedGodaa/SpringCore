package net.godaa.JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(AppConfig.class).registerShutdownHook();

    }
}
