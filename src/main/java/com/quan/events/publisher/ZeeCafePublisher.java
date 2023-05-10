package com.quan.events.publisher;

import com.quan.events.event.TheBigBangTheoryEvent;
import com.quan.events.listener.QuanListener;
import com.quan.events.listener.TraListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ZeeCafePublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private QuanListener quanListener;

    @Autowired
    private TraListener traListener;

    public void streamBingBangTheory(String epoNo) {
        System.out.println("Zee cafe: Start BBT " + epoNo);

        applicationEventPublisher.publishEvent(new TheBigBangTheoryEvent(this, "004"));
    }
}
