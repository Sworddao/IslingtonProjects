import java.util.Scanner;

public class GayAnalyzingSystem{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Do you like boys");
        String input1 = scan.nextLine();
        
        System.out.println("Do u touch ur talala");
        String input2 = scan.nextLine();
        
        if(input1.equals("yes")){
            System.out.println("You're Gay");
        }else if(input2.equals("yes")){
            System.out.println("You're mad gay icl fr twin lock in twin");
        }else{
            System.out.println("You're a man");
        }
        scan.close();
        
    }
}