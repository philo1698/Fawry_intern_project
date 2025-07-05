package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void checkout(ArrayList<bought_product> Choosen_products, customer Customer){
        float total_wieght = 0;
        for(bought_product product_quantity : Choosen_products){
            if(product_quantity.getProduct().isIs_shippable()){
                System.out.println();
            }
        }
    }
}