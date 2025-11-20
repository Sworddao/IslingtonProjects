import java.util.Scanner;

public class EligibleVote{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your age");
        int age = scan.nextInt();
        
        if(age >= 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You are underage");
        }
        scan.close();
        
        
    }
}