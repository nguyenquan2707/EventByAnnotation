package com.quan.events.listener;


import com.quan.events.event.ComedyCircusEvent;
import com.quan.events.event.TheBigBangTheoryEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NganListener {

    public void watchComedyCircus(String epNo) {
        System.out.println("Ngan is watching comedyCircus " + epNo);
    }

    @EventListener
    public void onApplicationEvent(ComedyCircusEvent event) {
        watchComedyCircus(event.getEpoNo());

    }
}
