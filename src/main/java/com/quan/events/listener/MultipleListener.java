package com.quan.events.listener;

import com.quan.events.event.TransactionFailuerEvent;
import com.quan.events.event.TransactionFailuerEvent2;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MultipleListener {

    @EventListener
    public void listenOnTransactionFail(TransactionFailuerEvent event) {
        System.out.println("Hi " + event.getName() + " transaction fail with amount = " + event.getAmount() + " TransactionFailuerEvent");
    }

    @EventListener
    public void listenOnTransactionFail2(TransactionFailuerEvent2 event) {
        System.out.println("Hi " + event.getName() + " transaction fail with amount = " + event.getAmount() + " TransactionFailuerEvent2");
    }
}
