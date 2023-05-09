package com.quan.events.listener;


import com.quan.events.event.TheBigBangTheoryEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class QuanListener {

    public void watchBigBang(String epNo) {
        System.out.println("Quan is watching, playing BBT " + epNo);
    }

    @EventListener
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpoNo());

    }
}
