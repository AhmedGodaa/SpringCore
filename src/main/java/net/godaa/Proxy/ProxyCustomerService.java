package net.godaa.Proxy;

import net.godaa.Proxy.CustomerService;

public class ProxyCustomerService extends CustomerService {

    public void answer(String string){
        LoggerAspect loggerAspect = new LoggerAspect();
        loggerAspect.log();
        super.answer(string);
    }
}
