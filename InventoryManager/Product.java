package InventoryManager;

public class Product {
  private String name;
  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public void getInfo() {
    System.out.printf("Name: %s | Price: $%.2f%n", this.name, this.price);
  }
}