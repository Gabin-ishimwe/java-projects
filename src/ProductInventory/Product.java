package ProductInventory;

public class Product {
    String name;
    double price;
    int id;
    double quantity;

    Product(String name,double price, int id, double quantity) {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
        this.name = name;

    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    double getPrice() {
        return this.price;
    }

    double getQuantity() {
        return this.quantity;
    }

}
