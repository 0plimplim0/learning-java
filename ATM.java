import java.util.Scanner;

public class ATM {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    boolean running = true;
    double balance = 1000;

    while (running) {
      System.out.printf("Menu:%n%n1. Balance%n2. Deposit%n3. Retire%n4. Exit%n%nSelect an option: ");
      int selection = keyboard.nextInt();

      switch (selection) {
        case 1:
          System.out.printf("Balance: %.2f%n", balance);
          break;
        case 2:
          System.out.print("Amount to deposit: ");
          double amount = keyboard.nextDouble();
          if (amount >= 1) {
            balance += amount;
            break;
          }
          System.out.println("Invalid amount.");
          break;
        case 3:
          System.out.print("Amount to retire: ");
          amount = keyboard.nextDouble();
          if (amount <= balance) {
            balance -= amount;
            break;
          }
          System.out.println("Invalid amount.");
          break;
        case 4:
          System.out.println("Exiting...");
          running = false;
          break;
        default:
          System.out.println("Invalid option.");
      }
    }

    keyboard.close();
  }
}