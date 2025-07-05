package org.example;

public class customer {
    private String name;
    private float balance;

    public customer(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
