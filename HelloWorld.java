import java.util.Scanner;

public class HelloWorld {

  public static double toFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
  }
  public static double toKelvin(double celsius) {
    return celsius + 273.15;
  }
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter Celsius: ");
    double celsius = keyboard.nextDouble();
    
    System.out.printf("%.2f °C equals to %.2f °F and %.2f K.%n", celsius, toFahrenheit(celsius), toKelvin(celsius));

    keyboard.close();
  }
}