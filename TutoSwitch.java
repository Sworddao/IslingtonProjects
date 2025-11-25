import java.util.Scanner;

public class TutoSwitch{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose between 1,2,3");
        int choice = scan.nextInt();

        switch(choice){

            case 1: 
                System.out.println("Drink : Pepsi");
                break;

            case 2:
                System.out.println("Drink : Sprite");
                break;

            case 3: 
                System.out.println("Drink: Fanta");
                break;

            default:
                System.out.println("Not a valid choice");

        }
        scan.close();
    }
}