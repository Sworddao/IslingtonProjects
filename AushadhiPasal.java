import java.util.Scanner;

public class AushadhiPasal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your available medicines.");
        String med1 = scan.nextLine();
        String med2 = scan.nextLine();
        String med3 = scan.nextLine();
        String med4 = scan.nextLine();
        
        System.out.println("Quantities for each medicines.");
        int stock1 = scan.nextInt();
        int stock2 = scan.nextInt();
        int stock3 = scan.nextInt();
        int stock4 = scan.nextInt();
        
        System.out.println("Marked price of each medicines.");
        double price1 = scan.nextDouble();
        double price2 = scan.nextDouble();
        double price3 = scan.nextDouble();
        double price4 = scan.nextDouble();
        
        scan.nextLine();
        
        System.out.println("Ausadhi Pasal");
        System.out.println(med1 + " , " + " Quantity : " + stock1 + " , " + " Price: " + price1);
        System.out.println(med2 + " , " + " Quantity : " + stock2 + " , " + " Price: " + price2);
        System.out.println(med3 + " , " + " Quantity : " + stock3 + " , " + " Price: " + price3);
        System.out.println(med4 + " , " + " Quantity : " + stock4 + " , " + " Price: " + price4);
        
        System.out.println("Do you need prescription?");
        String prescription = scan.nextLine().toLowerCase();
        
        if(prescription.equals("Yes")){
            System.out.println("Your medicine has been prescribed");
        }
        else{
            System.out.println("You're free to go.");
        }
        scan.close();
        
        
        
    }
}
