package com.quan.events.publisher;

import com.quan.events.event.ComedyCircusEvent;
import com.quan.events.event.TheBigBangTheoryEvent;
import com.quan.events.listener.QuanListener;
import com.quan.events.listener.TraListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ZeeCafePublisher {

    //publisher don't care who is subscriber
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher; //This is root, from where it will push one or many event in Application

    public void streamBingBangTheory(String epoNo) {
        System.out.println("Zee cafe: Start BBT " + epoNo);

        applicationEventPublisher.publishEvent(new TheBigBangTheoryEvent("004"));
    }

    public void streamComedyCircus(String epNo) {

        System.out.println("Zee cafe: Start comedyCircus " + epNo);

        applicationEventPublisher.publishEvent(new ComedyCircusEvent(epNo));
    }
}
