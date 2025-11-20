import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {

        int pricePerkm = 5;
        int pricePermin =1;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Input distance in km");
        double dis = scan.nextDouble();

        System.out.println("Input time in minutes");
        double time = scan.nextDouble();
        scan.nextLine(); 

        System.out.print("Is the passenger local? (yes/no): ");
        String local = scan.nextLine().toLowerCase();

        System.out.println("Is the travel during nighttime? (yes/no): ");
        String night = scan.nextLine().toLowerCase();

        double fare = dis * pricePermin + time * pricePermin;
        
        if (local.equals("yes")) {
            fare = fare * 0.5;
        }
        else{
            System.out.println("Noted : Passenger is not Local");
        }

        if (night.equals("yes")) {
            fare = fare * 1.5;
        }
        else{
            System.out.println("Noted : It's daytime");
        }

        System.out.println("Total fare: Rs. " + Math.round(fare));

        scan.close();
    }
}
