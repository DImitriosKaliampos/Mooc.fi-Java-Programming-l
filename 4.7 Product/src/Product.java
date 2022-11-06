package Part4;

public class Product {
    
    private double price;
    private int quantity;
    private String name;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void printProduct() {
        System.out.println(name + "," + " price" +  + price + ", " + quantity + "pcs");
    }

}
