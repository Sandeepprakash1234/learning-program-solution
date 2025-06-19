public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Mouse", 50, 299.99);
        Product p2 = new Product(102, "Keyboard", 30, 499.99);
        Product p3 = new Product(103, "Monitor", 20, 9999.99);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.printInventory();

        inventory.updateProduct(102, "Mechanical Keyboard", 40, 799.99);
        inventory.deleteProduct(101);

        inventory.printInventory();
    }
}
