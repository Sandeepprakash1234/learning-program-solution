import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product ID already exists.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        }
    }

    public void updateProduct(int productId, String name, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (products.remove(productId) != null) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void printInventory() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}
