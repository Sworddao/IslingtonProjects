import java.util.Scanner;

public class BeginnerChat{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("BeginnerChatBot: Hey, I'm your friendly java chat bot!!");
        String op = scan.nextLine().toLowerCase();
        
        if(op.contains("Hi") || op.contains("hello")){
            System.out.println("BeginnerChatBot: Hi! there! How are you today?");
        }
        while(true){
            System.out.println("What's your name?");
            String name = scan.nextLine().toLowerCase();
            
            if(name.contains(name)){
                System.out.println("Hello " + name + " have a great day !!");
            }
            String op1 = scan.nextLine();
            
            System.out.println("I am a developing java assistant so my features are limited for now!!");
            String bye = scan.nextLine().toLowerCase();
            
            if(bye.contains("bye")){
                System.out.println("Bye " + name + " I'll notify you for upcoming features"); 
            }
            break;                
            
        }
        
    }
}