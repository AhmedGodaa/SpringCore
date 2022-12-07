package net.godaa.Proxy;

public class MyBeanFactory {

    public Object getBean(String name){
        if (name.equals("customerService")){
            return new ProxyCustomerService();
        }else {
            return null;
        }
    }
}
