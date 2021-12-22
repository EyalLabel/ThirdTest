package Test;

import java.util.Arrays;

public class Department {

    public double averageDepartmentSalary;

    public void setAverageDepartmentSalary(Employee[] employees) {
        this.averageDepartmentSalary = getAverageDepartmentSalary(employees);
    }

    private double averageBonus;
    private String name;
    private Manager manager;
    private Employee[] employees = new Employee[15];

    public double getAverageDepartmentSalary(Employee[] employees) {
        double avgsal = 0;
        for (Employee item : employees) {
            avgsal += item.salary.getAmount();
        }
        return avgsal / employees.length;
    }

    public String getName() {
        return name;
    }
    public double getAverageDepartmentBonus(Employee[] employees) {
        double avgBonus = 0;
        for (Employee item : employees) {
            avgBonus += item.salary.getYearlyBonus();
        }
        return avgBonus / employees.length;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Department{" +
                "averageDepartmentSalary=" + averageDepartmentSalary +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

    public double getAverageDepartmentSalary() {
        return averageDepartmentSalary;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public double getAverageBonus() {
        return averageBonus;
    }

    public Department(String name, Manager manager, Employee[] employees) {
        this.name = name;
        this.manager = manager;
        this.employees = employees;
        this.averageDepartmentSalary = getAverageDepartmentSalary(employees);
        this.averageBonus=getAverageDepartmentBonus(employees);
    }
}
