package net.godaa.BeanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import org.springframework.stereotype.Component;


@Component
public class Customer implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String firstname;


    public Customer() {
        System.out.println("no args constructor initialized");
    }

    public Customer(String firstname) {
        this.firstname = firstname;
        System.out.println("all args constructor initialized " + firstname);
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
        System.out.println("setFirstname " + firstname);
    }

    public String getFirstname() {
        return firstname;
    }
    //    Bean Lifecycle
//    Aware Part

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanNameAware");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactoryAware ");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContextAware ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void customDestroy() throws Exception {
        System.out.println("destroy");
    }
}

