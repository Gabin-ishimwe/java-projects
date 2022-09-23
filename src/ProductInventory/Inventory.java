package ProductInventory;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Product> products = new ArrayList<>();
    void addProducts(Product product) {
        products.add(product);
    }
    int allProducts() {
        int sum = 0;
        for (int i = 0; i < products.size(); i ++) {
            sum +=1;
        }
        return sum;
    }
}
