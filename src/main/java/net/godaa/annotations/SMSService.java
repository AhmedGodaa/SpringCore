package net.godaa.annotations;

import org.springframework.stereotype.Component;
/*
    we added component so AppConfig can see it as bean
    and return it when we ask for this bean by ( name,class )
 */
@Component()
public class SMSService {
    void sendMessage(String string) {
        System.out.println(string);

    }
}
