import java.util.Scanner;

public class TernaryOp{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your age");
        int age = scan.nextInt();
        
        String isValid = (age >= 18) 
        ? "Driving is allowed" 
        : "Driving is not allowed";
        System.out.println(isValid);
    }
}