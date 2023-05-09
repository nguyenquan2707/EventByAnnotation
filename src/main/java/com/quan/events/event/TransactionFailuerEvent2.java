package com.quan.events.event;

public class TransactionFailuerEvent2 {

   private String name;

    private double amount;

    public TransactionFailuerEvent2(String name, double amount) {
        this.amount = amount;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
