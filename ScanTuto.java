import java.util.Scanner;

public class ScanTuto{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("whats ur first name?");
        String name  = scan.next();
        
        System.out.println("Whats ur age cuh?");
        int age = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Whats ur hobby?");
        String hobby = scan.nextLine();
        
        System.out.println("Thank you " + name + ", your age is " + age + " and your hobby is " + hobby + ".");
        
        
    }
}