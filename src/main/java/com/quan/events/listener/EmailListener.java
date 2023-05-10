package com.quan.events.listener;

import com.quan.events.event.TransactionFailuerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {

    @EventListener
    public void listenOnTransactionFail(TransactionFailuerEvent event) throws InterruptedException {
        System.out.println("Into EmailListener");
        sleep(4000);
        System.out.println("Hi " + event.getName() + " transaction fail with amount = " + event.getAmount() + " by email");
        System.out.println("End EmailListener");
    }

    private void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }
}
