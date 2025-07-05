package org.example;
import java.time.LocalDate;


public class product {
    private String name;
    private float price;
    private int quantity;
    private boolean can_expire;
    private LocalDate expire_date;
    private boolean is_shippable;
    private float wieght;

    public product(String name, float price, int quantity, boolean can_expire, LocalDate expire_date, boolean is_shippable, float wieght) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.can_expire = can_expire;
        this.expire_date = expire_date;
        this.is_shippable = is_shippable;
        this.wieght = wieght;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isCan_expire() {
        return can_expire;
    }

    public LocalDate getExpire_date() {
        return expire_date;
    }

    public boolean isIs_shippable() {
        return is_shippable;
    }

    public float getWieght() {
        return wieght;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
