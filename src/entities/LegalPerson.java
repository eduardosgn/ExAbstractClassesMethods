package entities;

public class LegalPerson extends Person {
    private int numberOfEmployees;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, double yearlyIncome, int numberOfEmployees) {
        super(name, yearlyIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees >= 10) {
            return getYearlyIncome() * 14.0 / 100.0;
        } else {
            return getYearlyIncome() * 16.0 / 100.0;
        }
    }
}
