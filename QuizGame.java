import java.util.Scanner;

public class QuizGame{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int Hearts = 5;
    
        System.out.println("What is the capital city of Nepal?");
        String ans1 = scan.nextLine().toLowerCase();
        
        if(ans1.equals("Kathmandu") || (ans1.equals("ktm"))){
            System.out.println("You got it right");
            System.out.println("Your current HP is : " + Hearts);
            
        }
        else{
            System.out.println("You got it wrong");
            Hearts--;
            System.out.println("Your current HP is : " + Hearts);
        }
        if (Hearts < 1) return;
        
        System.out.println("What is the syntax used to print in Java Programming?");
        String ans2 = scan.nextLine().toLowerCase();
        
        if(ans2.equals("sout")){
            System.out.println("You got it right");
            System.out.println("Your current HP is : " + Hearts);
            
        }
        else{
            System.out.println("You got it wrong");
            Hearts--;
            System.out.println("Your current HP is : " + Hearts);
        }
        if (Hearts < 1) return;
        
        System.out.println("What is Java Programming language?");
        String ans3 = scan.nextLine().toLowerCase();
        
        if(ans3.equals("oop") || (ans3.equals("Structure"))){
            System.out.println("You got it right");
            System.out.println("Your current HP is : " + Hearts);
        }
        else{
            System.out.println("You got it wrong");
            Hearts--;
            System.out.println("Your current HP is : " + Hearts); 
        }
        if (Hearts < 1) return;
        
        System.out.println("What is the capital of India?");
        String ans4 = scan.nextLine().toLowerCase();
        
        if(ans4.equals("New Delhi") || (ans4.equals("newdelhi"))){
            System.out.println("You got it right");
            System.out.println("Your current HP is : " + Hearts);
        }
        else{
            System.out.println("You got it wrong");
            Hearts--;
            System.out.println("Your current HP is : " + Hearts);
        }
        if (Hearts < 1) return;
        
        System.out.println("What is the capital of USA?");
        String ans5 = scan.nextLine().toLowerCase();
        
        if(ans5.equals("New York") || (ans5.equals("newyork"))){
            System.out.println("You got it right");
            System.out.println("Your current HP is : " + Hearts);
        }
        else{
            System.out.println("You got it wrong");
            Hearts--;
            System.out.println("Your current HP is : " + Hearts);
        }
        if (Hearts < 1) return;
        

        if (Hearts == 0) {
            System.out.println("Game Over! You ran out of hearts.");
        } else {
            System.out.println("Congratulations! You finished the quiz with " + Hearts + " hearts left!");
        }
        
    }
}