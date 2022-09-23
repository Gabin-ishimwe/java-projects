package ProductInventory;

/*
* Product Inventory Project - Create an application which manages an inventory of products. Create a product class which
* vhas a price, id, and quantity on hand. Then create an inventory class which keeps track of various products
*  and can sum up the inventory value
* */

public class Main {
    public static void main(String[] args) {
        System.out.println("Product Inventory App");
//        Product product = new Product();
        Product product1 = new Product("bread", 10, 2, 200);
        Product product2 = new Product("cake", 20, 1, 100);
        Product product3 = new Product("biscuits", 30, 3, 300);
        Inventory inventory = new Inventory();
        inventory.addProducts(product1);
        inventory.addProducts(product2);
        inventory.addProducts(product3);

        System.out.println(inventory.allProducts());
    }

}
