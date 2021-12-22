package Test;

public class Employee extends Person{
    protected Salary salary;
public static double averageAge=0;
public static int employeeCount=0;
    public Employee(String name, int age, Salary salary) {
        super(name, age);
        this.salary = salary;
        averageAge+=age;
        employeeCount+=1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(){
        this.name="Bibi";
        this.age=(int)(Math.random()*(60-20+1)+20);
        this.salary=new Salary((Math.random()*(50000-1000+1)+1000), (int) (Math.random()*10000));
        averageAge+=age;
        employeeCount+=1;
    }

    public Salary getSalary() {
        return salary;
    }
    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}

