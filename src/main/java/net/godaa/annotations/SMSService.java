package net.godaa.annotations;

import org.springframework.stereotype.Component;

@Component
public class SMSService {
    void sendMessage(String string) {
        System.out.println(string);

    }
}
