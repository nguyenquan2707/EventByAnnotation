package com.quan.events.listener;


import com.quan.events.event.TheBigBangTheoryEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TraListener implements ApplicationListener<TheBigBangTheoryEvent> {

    public void watchBigBang(String epNo) {
        System.out.println("Tra is watching, playing BBT " + epNo);
    }

    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpoNo());
    }
}
