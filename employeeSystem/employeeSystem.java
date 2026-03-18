package employeeSystem;

import java.util.ArrayList;

public class employeeSystem {
  public static void main(String[] args) {
    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(new Developer("Developer 1", 4000, 200));
    employees.add(new Manager("Manager 1", 7000, 400));

    for (Employee e : employees) {
      System.out.printf("Employee name: %s | Employee total salary: %.2f%n", e.getName(), e.calculateSalary());
    }
  }
}
