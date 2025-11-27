import java.util.Scanner;

public class ExampleIncome{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your income: NPR ");
        double income = scan.nextDouble();
        
        double tax;
        
        
        if(income > 0 && income <= 500000){
            tax = income * 0.01;
        }else if(income > 500000 && income <= 700000){
            tax = 5000 + (income - 500000) * 0.1;
        }else if(income > 700000 && income <= 1200000){
            tax = 25000 + (income - 700000) * 0.2;
        }else if(income > 1200000 && income <= 2000000){
            tax = 150000+25000 + (income - 1200000) * 0.3;
        }else if(income > 2000000 && income <= 5000000){
            tax = 175000 + 288000 + (income - 200000) * 0.36;
        }else{
            tax = 463000 + (income - 5000000) * 0.39;
        }
        scan.close();
        
        System.out.println("Income payable tax: NPR " + tax);  
        
    }
}