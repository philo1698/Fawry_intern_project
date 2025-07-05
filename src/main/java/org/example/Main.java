package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void checkout(ArrayList<bought_product> Choosen_products, customer Customer){
        System.out.println("** Shipment notice **");
        float total_wieght = 0;
        for(bought_product product_quantity : Choosen_products){
            if(product_quantity.getProduct().isIs_shippable()){
                System.out.print(product_quantity.getQuantity_bought()+"x ");
                System.out.print(product_quantity.getProduct().getName()+"           ");
                System.out.println(product_quantity.getProduct().getWieght()+"g");
                total_wieght += product_quantity.getProduct().getWieght();
            }
        }
        System.out.println("Total package weight  "+total_wieght+"g");
        System.out.println();
        System.out.println("** Checkout receipt **");
        float sub_total = 0;
        for(bought_product product_quantity : Choosen_products){
            if(product_quantity.getProduct().isIs_shippable()){
                System.out.print(product_quantity.getQuantity_bought()+"x ");
                System.out.print(product_quantity.getProduct().getName()+"           ");
                System.out.println(product_quantity.getProduct().getPrice());
                sub_total += product_quantity.getProduct().getPrice();
            }
        }
        System.out.println("----------------------");
        System.out.println("Subtotal           " + sub_total);
        System.out.println("Shipping            30");
        System.out.println("Amount             " + (sub_total+30));

    }
}