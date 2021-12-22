package Test;

public class Salary {
    private double amount;
    private int yearlyBonus;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount < 1000) {
            System.out.println("Minimum is 1000- changing value to minimum");
            this.amount = 1000;
        } else if (amount > 50000) {
            System.out.println("Maximum is 50000- changing value to max");
            this.amount = 50000;
        } else {
            this.amount = amount;
        }
    }

    public int getYearlyBonus() {
        return yearlyBonus;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                ", yearlyBonus=" + yearlyBonus +
                '}';
    }

    public Salary(double amount, int yearlyBonus) {
        setAmount(amount);
        setYearlyBonus(yearlyBonus);
    }

    public void setYearlyBonus(int yearlyBonus) {
        if (yearlyBonus < 0) {
            System.out.println("Minimum is 0 changing value to minimum");
            this.yearlyBonus = 0;
        } else if (yearlyBonus > 10000) {
            System.out.println("Maximum is 10000- changing value to max");
            this.yearlyBonus = 10000;
        } else {
            this.yearlyBonus = yearlyBonus;
        }
    }
}
