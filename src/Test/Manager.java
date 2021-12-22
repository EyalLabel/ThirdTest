package Test;

public class Manager extends Employee {
    final double minSalary = 25000;

    public Manager(String name, int age, Salary salary) {
        super(name, age, salary);
        if (salary.getAmount() < minSalary) {
            System.out.println("Managers make at least 25,000");
            salary.setAmount(25000);
        }

    }

    public Manager() {
        this.name = "Manny";
        this.age = (int) (Math.random() * (60 - 20 + 1) + 20);
        this.salary = new Salary((Math.random() * (50000 - 25000 + 1) + 25000), (int) (Math.random() * 10000));
    }

    public double getMinSalary() {
        return minSalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
