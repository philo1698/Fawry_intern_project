package org.example;
import java.util.ArrayList;


public class Cart {
    private ArrayList<product> products;
    private ArrayList<bought_product> Choosen_products;


    public Cart(ArrayList<product> products) {
        this.products = products;
        Choosen_products = new ArrayList<>();
    }

    public void add(String name, int quantity){
        for (product Product : products) {
            if (Product.getName().equals(name) && (Product.getQuantity()==quantity)) {
                Choosen_products.add(new bought_product(Product,quantity));
                Product.setQuantity(Product.getQuantity()-quantity);
            }
        }
    }

    public ArrayList<bought_product> getChoosen_products() {
        return Choosen_products;
    }
}
