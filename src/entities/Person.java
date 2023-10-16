package entities;

public abstract class Person {
    private String name;
    private double yearlyIncome;

    public Person() {}

    public Person(String name, double yearlyIncome) {
        this.name = name;
        this.yearlyIncome = yearlyIncome;
    }

    public String getName() {
        return name;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public abstract double tax();
}
