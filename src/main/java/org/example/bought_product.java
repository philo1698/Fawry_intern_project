package org.example;

public class bought_product {
    private product Product;
    private int quantity_bought;

    public bought_product(product product, int quantity_bought) {
        Product = product;
        this.quantity_bought = quantity_bought;
    }

    public product getProduct() {
        return Product;
    }

    public int getQuantity_bought() {
        return quantity_bought;
    }
}
