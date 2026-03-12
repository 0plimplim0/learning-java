public class TipCalculator {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Use: TipCalculator <Total> <Percentage>");
      return;
    }
    try {
      double total = Double.parseDouble(args[0]);
      int percentage = Integer.parseInt(args[1]);
      double tip = total * percentage / 100;
      double finalBill = total + tip;
      System.out.printf("Total to pay: %.2f%n", finalBill);
    } catch (NumberFormatException e) {
      System.err.println("Error! Please enter valid numbers.");
    }
  }
}