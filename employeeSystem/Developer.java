package employeeSystem;

public class Developer extends Employee{

  private double projectBonus;

  public Developer (String name, double baseSalary, double projectBonus) {
    super(name, baseSalary);
    this.projectBonus = projectBonus;
  }

  @Override
  public double calculateSalary() {
    return getBaseSalary() + this.projectBonus;
  }

  public double getProjectBonus() { return this.projectBonus; }
  
}
