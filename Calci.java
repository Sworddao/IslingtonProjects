import java.util.Scanner;

public class Calci{
    public static void main(String[] args){
        
      Scanner scan = new Scanner(System.in);
      
        System.out.println("Enter two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        
        scan.close();

        
    }
}