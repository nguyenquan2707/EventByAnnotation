package com.quan.events.listener;

import com.quan.events.event.TransactionFailuerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SmsListener {

    @EventListener
//    @Order(1)
    public void listenOnTransactionFail(TransactionFailuerEvent event) {
        System.out.println("Hi " + event.getName() + " transaction fail with amount = " + event.getAmount() + " by sms");
    }
}
