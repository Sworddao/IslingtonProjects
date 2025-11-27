import java.util.Scanner;

public class DivisibleBy3Or5{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = scan.nextInt();
        
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("The number is divisible by 3 and 5");
        }else{
            System.out.println("The number is not divisible by 3 and 5");
        }
        scan.close();
    }
}