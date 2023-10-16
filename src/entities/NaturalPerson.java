package entities;

public class NaturalPerson extends Person {
    private double healthExpenditures;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, double yearlyIncome, double healthExpenditures) {
        super(name, yearlyIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getYearlyIncome() >= 20000.00 && healthExpenditures > 0.0) {
            return (getYearlyIncome() * 25.0 / 100.0) - (healthExpenditures * 5.0 / 100.0);
        } else {
            return getYearlyIncome() * 15.0 / 100.0;
        }
    }
}