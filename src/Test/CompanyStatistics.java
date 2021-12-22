package Test;

public class CompanyStatistics {
    public static void main(String[] args) {
Department[] departments;
        for (Department department : departments = new Department[]{
                new Department("Sales", new Manager(), createDepartment()),
                new Department("Finance", new Manager(), createDepartment()),
                new Department("Administration", new Manager(), createDepartment()),
                new Department("Engineering", new Manager(), createDepartment()),
                new Department("Marketing", new Manager(), createDepartment()),
        }) {

        }

        Company google=new Company(departments);
        System.out.println("Average company salary is "+google.getAverageSalary());
      for (Department item:departments){
          System.out.println("For department "+item.getName()+" Salary is "+item.getAverageDepartmentSalary());
          System.out.println("For department "+item.getName()+" Yearly Bonus is "+item.getAverageBonus());
      }
        System.out.println("The average Employee age is "+(Employee.averageAge/Employee.employeeCount));
    }
    public static Employee[] createDepartment(){
        final int departmentSize=15;
        Employee[] randomDepartment=new Employee[departmentSize];
        for (int i=0;i<departmentSize;i+=1){
            randomDepartment[i]=new Employee();
        }
        return randomDepartment;
    }
}
