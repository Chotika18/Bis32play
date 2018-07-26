package models;

/**
 * Created by COM2-01-PC on 12/7/2561.
 */
public class Animal {
    private String id,type;
    private double price;
    private int amount;

    public Animal() {
    }

    public Animal(String id, String type, double price, int amount) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
