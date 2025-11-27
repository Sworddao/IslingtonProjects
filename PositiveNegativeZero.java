import java.util.Scanner;

public class PositiveNegativeZero{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = scan.nextInt();
        
        if(num > 0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("The number is " + num); // to check if the number is zero;
        }
    }
}