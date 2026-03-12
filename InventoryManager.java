public class InventoryManager {

  public static class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock){
      this.name = name;
      this.price = price;
      this.stock = stock;
    }

    public void sell(int amount) {
      if (amount > this.stock) {
        System.out.println("Not enough stock.");
        return;
      }
      this.stock -= amount;
    }
    
    public void info() {
      System.out.printf("Name: %s%nPrice: %.2f%nStock: %d%n", this.name, this.price, this.stock);
    }
  }

  public static void main(String[] args) {
    Product[] products = {
      new Product("Iphone", 1000, 10),
      new Product("Samsung", 500, 20)
    };

    for (Product p : products) {
      p.info();
      p.sell(3);
      p.info();
    }
  }
}