package net.godaa.Proxy;

public class Main {
    public static void main(String[] args) {
        MyBeanFactory myBeanFactory = new MyBeanFactory();
        CustomerService customerService = (CustomerService) myBeanFactory.getBean("customerService");
        customerService.answer("Hello Every One");
    }
}
