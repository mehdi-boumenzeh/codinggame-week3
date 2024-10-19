public class Food extends Product {
    private String expirationDate;

    public Food(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Expiration Date: "+expirationDate);
        

    }
    
}
