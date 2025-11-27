import java.util.Scanner;

public class IncomeTaxCalculator{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Annual Income in NPR: ");
        double income = scan.nextDouble();  
        double tax;

        if (income < 0) {
            System.out.println("Income can't be negative.");
            return;
        }
        
        if (income <= 500000) {
            tax = income * 0.01;

        }else if (income <= 700000) {
            tax = 5000 + (income - 500000) * 0.10;

        }else if (income <= 1000000) {
            tax = 25000 + (income - 700000) * 0.20;

        }else if (income <= 2000000) {
            tax = 85000 + (income - 1000000) * 0.30;

        }else if (income <= 5000000) {
            tax = 385000 + (income - 2000000) * 0.36;

        }else { 
            tax = 1465000 + (income - 5000000) * 0.39;
        }

        System.out.println("Annual Income: NPR " + income);
        System.out.println("Total Tax Payable: NPR " + tax);
    }
}