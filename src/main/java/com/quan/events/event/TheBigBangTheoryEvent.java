package com.quan.events.event;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class TheBigBangTheoryEvent extends ApplicationEvent {

    private String epoNo;


    public TheBigBangTheoryEvent(Object source, String epoNo) {
        super(source);
        this.source = source;
        this.epoNo = epoNo;
    }

    public TheBigBangTheoryEvent(Object source) {
        super(source);
    }

    public TheBigBangTheoryEvent(Object source, Clock clock) {
        super(source, clock);
    }

    public String getEpoNo() {
        return epoNo;
    }

    public void setEpoNo(String epoNo) {
        this.epoNo = epoNo;
    }
}
