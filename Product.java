public class Product{
    private String name;
    private double price;
    private int quantity;
    public void displayInfo(){
        System.out.println("Product name : "+name);
        System.out.println("Product price : "+price);
        System.out.println("Product quantity : "+quantity);
    }

    public Product(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public void updateQuantity(int newQuantity){
        this.quantity=newQuantity;
    }

    public double getPrice(){
        return this.price;
    }

    public static void welcomeMessage(){
        System.out.println("Welcome to the inventory system !");
    }
    
    public void updateQuantity(int addedQuantity, boolean addToExisting) {
        if (addToExisting) {
            this.quantity += addedQuantity;
            System.out.println("Added " + addedQuantity + " units. New quantity: " + quantity);
        } else {
            this.quantity = addedQuantity;
            System.out.println("Quantity updated to " + addedQuantity);
        }
    }
}
