import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {

  public static interface PaymentMethod {
    void process(double amount);
  }

  public static class CreditCard implements PaymentMethod {
    private String number;
    private String expires_at;
    private String cardholder;

    public CreditCard(String number, String expires_at, String cardholder) {
      this.number = number;
      this.expires_at = expires_at;
      this.cardholder = cardholder;
    }

    public void getInfo() {
      System.out.printf("Cardholder: %s%nNumber: %s%nExpiry date: %s", this.cardholder, this.number, this.expires_at);
    }

    public void process(double amount) {
      double finalAmount = addCommission(amount);
      System.out.printf("Paying %.2f with Card (3%% commission)%n", finalAmount);
    }

    private double addCommission(double amount) {
      double commission = amount * 3 / 100;
      return amount + commission;
    }
  }

  public static class Crypto implements PaymentMethod {
    private String walletAddress;
    private String blockchain;
    private String symbol;
    private String walletName;

    public Crypto(String address, String blockchain, String symbol, String name) {
      this.walletAddress = address;
      this.blockchain = blockchain;
      this.symbol = symbol;
      this.walletName = name;
    }
    
    public void getInfo() {
      System.out.printf("Name: %s%nAddress: %s%nBlockchain: %s (%s)%n", this.walletName, this.walletAddress, this.blockchain, this.symbol);
    }

    public void process(double amount) {
      System.out.printf("Paying %.2f with Crypto (no commission)%n", amount);
    }
  }

  public record Transaction(
    double amount,
    String userId
  ) {}

  public static void main(String[] args) {
    List<Transaction> transactions = new ArrayList<>(List.of(
      new Transaction(150.50, "usr101"),
      new Transaction(42.00, "usr205"),
      new Transaction(890.99, "usr101"),
      new Transaction(15.25, "usr312"),
      new Transaction(210.00, "usr205"),
      new Transaction(5.00, "usr440")
    ));

    List<Transaction> highers = transactions.stream()
      .filter(t -> t.amount > 100)
      .toList();

    for (Transaction t : highers) {
      System.out.printf("Amount: %.2f | UserID: %s%n", t.amount(), t.userId());
    }
  }
}