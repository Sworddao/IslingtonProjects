import java.util.Scanner; 

public class SwitchPract {
    public static void main(String[] args){
     
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What do u wanna do?, Choose: ");
        System.out.println("1. Dance");
        System.out.println("2. Play");
        System.out.println("3. Goon");
        System.out.println("4. Exit");
        String option = scan.nextLine().toLowerCase();  // user input in lowercase
        
        switch(option){
            case "dance":
                System.out.println("You danced");
                break;
            case "play":
                System.out.println("You Played");
                break;
            case "goon":
                System.out.println("You gooned");
                break;
            case "exit":
                System.out.println("Bye bitch");
                break;
            default:
                System.out.println("Out of bounds cuh");
        }
        
        scan.close();
    }
}
