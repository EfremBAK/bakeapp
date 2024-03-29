import java.util.Arrays;

//creating public class named Main with variable names//
public class BakeGoods {

    private String name;
    private double price;
    private String expirationDate;
    private String[] dietRestriction;
    private int quantityInStock;

    //default constructor//
    public BakeGoods() {
    }
    //setters and getters for each variable//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String[] getDietRestriction() {
        return dietRestriction;
    }

    public void setDietRestriction(String[] dietRestriction) {
        this.dietRestriction = dietRestriction;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    //overloaded constructor//
    public BakeGoods(String name, double price, String expirationDate, String[] dietRestriction, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.dietRestriction = dietRestriction;
        this.quantityInStock = quantityInStock;
    }
    public void displayText() {
        System.out.println("Name: " + name + " Price: " + price + " Expiration date: " + expirationDate + " Quanity in stock: " + quantityInStock + " Restrictions: " + Arrays.toString(dietRestriction));
    }

    public void displayWelcomeText() {
        System.out.println("Welcome to the EPS's Better Bakery App! ");
        System.out.println("We contain peanut, gluten, soy, egg and dairy in our products. ");
    }
    //method to print the statement //
    static void pricing(double price) {
    }
}
