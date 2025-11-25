import java.util.Scanner;

public class Tuto{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();

        if(num % 3 == 0){

            if(num % 5 == 0){
                System.out.println("divisible by 5 and 3");
            }else{
                System.out.println("divisible by 3 and not divisible by 5");
            }
        }else if (num % 5 == 0){
            if(num % 3 == 0){
                System.out.println();
            }

            else{
                System.out.println();
            }
        }
        scan.close();
    }
}