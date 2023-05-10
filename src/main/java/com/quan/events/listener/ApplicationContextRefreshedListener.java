package com.quan.events.listener;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRefreshedListener {


    @EventListener
    public void refresh(ContextRefreshedEvent event) {
        String appName = event.getApplicationContext().getApplicationName();

        System.out.println("event = " + event + ".............");
    }

    @EventListener
    public void handleContextStartedEvent(ContextStartedEvent event) {
        System.out.println("Application starting....." + event);
    }

    @EventListener
    public void handleContextStopEvent(ContextStoppedEvent event) {
        System.out.println("Application Stop....." + event);
    }

    @EventListener
     public void handleContextClosedEvent(ContextClosedEvent event) {
        System.out.println("Application Close....." + event);
    }
}
