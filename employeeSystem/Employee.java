package employeeSystem;

public abstract class Employee {

  private String name;
  private double baseSalary;

  public Employee(String name, double baseSalary) {
    this.name = name;
    this.baseSalary = baseSalary;
  }
  
  public abstract double calculateSalary();

  public String getName() { return this.name; }

  public double getBaseSalary() { return this.baseSalary; }
}