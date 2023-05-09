package com.quan.events.listener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRefreshedListener {


    @EventListener
    public void refresh(ContextRefreshedEvent event) {
        String appName = event.getApplicationContext().getApplicationName();

        System.out.println("event = " + event + ".............");
    }
}
