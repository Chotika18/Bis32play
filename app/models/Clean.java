package models;

/**
 * Created by COM2-01-PC on 12/7/2561.
 */
public class Clean {
    private String Id,Name,Brand;
    private double Price;
    private int Amount,Size;

    public Clean() {
    }

    public Clean(String id, String name, String brand, double price, int amount, int size) {
        Id = id;
        Name = name;
        Brand = brand;
        Price = price;
        Amount = amount;
        Size = size;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }
}
