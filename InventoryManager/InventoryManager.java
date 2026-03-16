package InventoryManager;

import java.util.Scanner;

public class InventoryManager {

  public static Product[] products = new Product[5];

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double totalSum = 0;
    Product higher;

    for (int i = 0; i < 5; i++) {
      System.out.print("Name of the product: ");
      String name = keyboard.nextLine();
      System.out.print("Price of the product: ");
      double price = Double.parseDouble(keyboard.nextLine());
      products[i] = new Product(name, price);
    }
    
    higher = products[0];

    for (Product p : products) {
      if (p.getPrice() > higher.getPrice()) {
        higher = p;
      }
      p.getInfo();
      totalSum += p.getPrice();
    }

    System.out.printf("The sum of the total of all products is $%.2f, and the most expensive product is: %s%n", totalSum, higher.getName());

    keyboard.close();
  }

}