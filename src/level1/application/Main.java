package level1.application;

import level1.model.EmptySaleException;
import level1.model.Product;
import level1.model.Sale;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sale.addProduct(new Product("T-shirt", 9.99));
        sale.addProduct(new Product("Pants", 19.99));

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: You accessed an index outside the array range.");
        }
    }
}


