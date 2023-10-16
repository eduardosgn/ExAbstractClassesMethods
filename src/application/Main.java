package application;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> payersList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company? (i/c): ");
            char type = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double yearlyIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExp = sc.nextDouble();

                payersList.add(new NaturalPerson(name, yearlyIncome, healthExp));
            }
            else if (type == 'c') {
                System.out.print("Number of employees: ");
                int numEmp = sc.nextInt();

                payersList.add(new LegalPerson(name, yearlyIncome, numEmp));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Person payer : payersList) {
            System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
        }

        System.out.println();
        System.out.println("TOTAL TAXES:");
        double sum = 0.0;
        for (Person payer : payersList) {
            sum += payer.tax();
        }
        System.out.println("$ " + String.format("%.2f", sum));

        sc.close();
    }
}
