package net.godaa.BeanLifeCycle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// this will search for the class or its defined name for
@ComponentScan({"net.godaa.BeanLifeCycle"})
public class BeanLifecycleConfig {
}
