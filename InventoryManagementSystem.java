
public class InventoryManagementSystem {
    public static void main(String[] args) {
      
        Product.welcomeMessage();

  
        Product randomProduct = new Product("Random Product", 10.0, 100);
        Electronics laptop = new Electronics("Laptop", 1000.0, 50, "Lenovo", 2);
        Food apple = new Food("Apple", 1.0, 200, "2024-12-31");

        
        System.out.println("\n Random Product Info :");
        randomProduct.displayInfo();

        System.out.println("\n Laptop Info :");
        laptop.displayInfo();

        System.out.println("\nApple Info :");
        apple.displayInfo();

        
        System.out.println("\nUpdating quantities...");
        randomProduct.updateQuantity(110); 
        laptop.updateQuantity(50, true); 
        apple.updateQuantity(140, false); 

        
        System.out.println("\nUpdated Product Info :");
        randomProduct.displayInfo();
        laptop.displayInfo();
        apple.displayInfo();
    }
}
