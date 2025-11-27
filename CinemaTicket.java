import java.util.Scanner;

public class CinemaTicket{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double finalPrice;

        System.out.println("Choose age Group (Child/Adult/Senior): ");
        String ageGroup = scan.nextLine().toLowerCase();

        System.out.println("Choose movie language (Nepali/Hindi/English): ");
        String language = scan.nextLine().toLowerCase();

        System.out.println("Is registered student? (yes/no) : ");
        String isStudent = scan.nextLine().toLowerCase();

        System.out.println("Is festival time? (yes/no) : ");
        String isFestival = scan.nextLine().toLowerCase();

        switch (ageGroup) {
            case "child":
                finalPrice = 150.0;
                break;
            case "adult":
                finalPrice = 250.0;
                break;
            case "senior":
                finalPrice = 200.0;
                break;
            default:
                System.out.println("Invalid age group");
                return;
        }

        switch (language) {
            case "hindi":
                finalPrice += 50.0; 
                System.out.println("Hindi Surcharge (+Rs. 50): Rs. " + finalPrice);
                break;
            case "english":
                finalPrice += 100.0; 
                System.out.println("English Surcharge (+Rs. 100): Rs. " + finalPrice);
                break;
            case "nepali":
                System.out.println("Nepali Movie: No Surcharge.");
                break;
            default:
                System.out.println("Invalid language. No surcharge applied.");
        }

        switch (isStudent){
            case "yes":
                double studentDiscount = finalPrice * 0.20;
                finalPrice -= studentDiscount;
                System.out.println("Student Discount: Rs. " + studentDiscount);
                break;
            default:
                System.out.println("Noted");
        }

       switch (isFestival){
           case "yes":
               double festivalDiscount = finalPrice * 0.15;
               finalPrice -= festivalDiscount;
               System.out.println("Festival Discount: Rs. " + festivalDiscount);
       }

        System.out.println("FINAL TICKET PRICE: Rs. " + finalPrice);

    }
}