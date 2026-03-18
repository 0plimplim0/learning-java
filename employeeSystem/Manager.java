package employeeSystem;

public class Manager extends Employee{

  private double leadershipIncentive;

  public Manager(String name, double baseSalary, double leadershipIncentive) {
    super(name, baseSalary);
    this.leadershipIncentive = leadershipIncentive;
  }

  @Override
  public double calculateSalary() {
    return getBaseSalary() + this.leadershipIncentive;
  }

  public double getLeadershipIncentive() { return this.leadershipIncentive; }
  
}
