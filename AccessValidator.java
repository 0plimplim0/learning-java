import java.util.Scanner;

public class AccessValidator {

  private static final String username = "username";
  private static final String password = "password";

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter username: ");
    String uname = keyboard.nextLine();
    if (!uname.equals(username)) {
      System.out.println("User not found.");
      keyboard.close();
      return;
    }
    System.out.print("Enter password: ");
    String pswd = keyboard.nextLine();
    if (!pswd.equals(password)) {
      System.out.println("Wrong password.");
      keyboard.close();
      return;
    }
    System.out.printf("Access granted! Welcome %s.%n", username);
    
    keyboard.close();
  }
}