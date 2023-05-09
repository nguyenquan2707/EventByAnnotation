package com.quan.events.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.time.Clock;

public class TheBigBangTheoryEvent {

    private String epoNo;


    public TheBigBangTheoryEvent(String epoNo) {
        this.epoNo = epoNo;
    }
    public String getEpoNo() {
        return epoNo;
    }

    public void setEpoNo(String epoNo) {
        this.epoNo = epoNo;
    }
}
