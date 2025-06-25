package level1.model;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sale() {
        products = new ArrayList<>();
        totalPrice = 0.0;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }


    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {

            throw new EmptySaleException("To make a sale you must add products first");
        }

        totalPrice = 0.0;
        for (Product p : products) {

            totalPrice += p.getPrice();
        }

        System.out.println("Total sale price: " + totalPrice + " €");
    }
}

