package Test;

import java.util.Arrays;

public class Company {
private double averageSalary;
  private  Department[] departments=new Department[5];
  public double getaverageSalary(Department[]departments) {
    double avgsal = 0;
    for (Department item : departments) {
      avgsal += item.averageDepartmentSalary;
    }
    return avgsal/departments.length;
  }
  public Company(Department[] departments) {
    this.departments = departments;
    this.averageSalary=getaverageSalary(departments);
  }

  public double getAverageSalary() {
    return averageSalary;
  }

  @Override
  public String toString() {
    return "Company{" +
            "averageCompanySalary=" + averageSalary +
            ", departments=" + Arrays.toString(departments) +
            '}';
  }
}
