package org.example;
import java.util.ArrayList;


public class Cart {
    private ArrayList<product> products;
    private ArrayList<product> Choosen_products;


    public Cart(ArrayList<product> products) {
        this.products = products;
        Choosen_products = new ArrayList<>();

    }

    public void add(String name, int quantity){

    }
}
