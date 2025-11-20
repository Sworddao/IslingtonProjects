import java.util.Scanner;

public class BmiCalculator{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("whats your height? in (m)");
        double height = scan.nextDouble();
        
        System.out.println("Whats your weight? in (kg)");
        double weight = scan.nextDouble();
        
        double bMi = weight/(height * height);
        System.out.println("Your BMI is " + bMi);
        
        if(bMi < 18.5){
            System.out.println("Underweight");
        }
        else if(bMi < 25){
            System.out.println("Pefect body ong");
        }
        else if(bMi < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("fatass obesse");
        }
        scan.close();
        
    }
}