import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int score = 0;
        
        String[] choices = {"rock", "paper", "scissor"};
        while(true){
        System.out.println("Choose your hand gng");
        System.out.println("Score : " + score);
        String user = scan.nextLine().toLowerCase();
        String computer = choices[rand.nextInt(3)];
        score++; 
        
         if(user.equals("exit")){
            System.out.println("aight");
            break;
        }
        System.out.println("I choose: " + computer);
        
        if(user.equals(computer)){
            System.out.println("It's a tie gng ngl");
        }
        else if((user.equals("rock") && computer.equals("scissor")) || (user.equals("paper") && computer.equals("rock")) || (user.equals("scissor") && computer.equals("paper"))){
            System.out.println("You win this time but fs imma thrash ur ahh next time fsfs");
        }
        else{
            System.out.println("I WON BITCH YOU SUCK LOWK KYS ATP ICL");
        
        }
    }
        
    }
}