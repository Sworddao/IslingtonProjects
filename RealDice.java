import java.util.Random;
import java.util.Scanner;

public class RealDice{
    public static void main(String[] args){
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int dice = rand.nextInt(6) + 1;
        System.out.println("Wanna roll a dice cuh?");
        String roll = scan.nextLine().toLowerCase();
        
        if(roll.equals("yes")){
        System.out.println("You rolled a " + dice);
        }
        else{
            System.out.println("aight nga cya tata");
        }
        if(dice == 6){
            System.out.println("HOLY SHIT THATS CRAZY");
        }
        else{
            System.out.println("ahh luck hah");
        }
            
        
        scan.close();
                
        
    }
}