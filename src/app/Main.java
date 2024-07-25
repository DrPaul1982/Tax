package app;

import java.util.Scanner;

public class Main {

    private final static String CASH = "EUR";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your salary " + CASH + ": ");
        double salaryPrimary = scanner.nextDouble();

        double salaryFinal;

        if (salaryPrimary <= 10000 & salaryPrimary > 0) {
            salaryFinal = salaryPrimary - (salaryPrimary * 2.5 / 100);
            System.out.printf("Your tax is 2,5 percents. You will get %s %.2f. ", CASH, salaryFinal);

        } else if (salaryPrimary > 10000 & salaryPrimary <= 25000) {
            salaryFinal = salaryPrimary - (salaryPrimary * 4.3 / 100);
            System.out.printf("Your tax is 4,3 percents. You will get %s %.2f. ", CASH, salaryFinal);

        } else if (salaryPrimary > 25000) {
            salaryFinal = salaryPrimary - (salaryPrimary * 6.7 / 100);
            System.out.printf("Your tax is 6,7 percents. You will get %s %.2f. ", CASH, salaryFinal);
        }
        else
            System.out.print("WTF? Go and find another job!");
    }
}