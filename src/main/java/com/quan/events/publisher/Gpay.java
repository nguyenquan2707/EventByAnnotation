package com.quan.events.publisher;

import com.quan.events.event.TransactionFailuerEvent;
import com.quan.events.event.TransactionFailuerEvent2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Gpay {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void sendMoney(String name, double amount, boolean condition) {

        try {
            if (condition) {
                throw new RuntimeException("Oop something is wrong");
            }

            System.out.println("Hi: " + name + " sending amount " + amount + " is successful");
        }
        catch (Exception e) {
            eventPublisher.publishEvent(new TransactionFailuerEvent(name, amount));
            eventPublisher.publishEvent(new TransactionFailuerEvent2(name, amount));
            e.printStackTrace();
        }
    }
}
