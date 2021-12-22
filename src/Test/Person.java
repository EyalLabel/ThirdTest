package Test;

public class Person {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public Person() {
        this.name = "nobody";
    }

    public void setAge(int age) {
        if (age < 20) {
            System.out.println("Minimum is 20 changing value to minimum");
            this.age = 20;
        } else if (age > 60) {
            System.out.println("Maximum is 60- changing value to max");
            this.age = 60;
        } else {
            this.age = age;

        }

    }
}

