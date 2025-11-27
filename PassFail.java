import java.util.Scanner;

public class PassFail{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your marks");
        double marks = scan.nextDouble();
        
        if(marks > 40){
            System.out.println("You passsed");
        }else{
            System.out.println("You failed");
        }
        scan.close();
    }
}