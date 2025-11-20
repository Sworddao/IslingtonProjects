import java.util.Scanner;

public class LabScan{
    public static void main(String[] args){
        
        int age;
        age = 18;
        
        int quantity = 5;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter any number");
        int a = scan.nextInt();
        
        System.out.println("My first number is " + a);
        
        System.out.println("=========================================");
        
        System.out.println("Enter another number");
        int b = scan.nextInt();
        
        System.out.println("My second number is " + b);
        scan.close();
        
    
        
        
    }
}