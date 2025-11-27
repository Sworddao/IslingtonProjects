import java.util.Scanner;

public class SellingPriceCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the marked price: ");
        float mp = scan.nextFloat();

        System.out.print("Enter the category (A, B, C, D): ");
        System.out.println("\nCategory A = 60% discount");
        System.out.println("Category B = 40% discount");
        System.out.println("Category C = 20% discount");
        System.out.println("Category D = 10% discount");
        
        char category = scan.next().toLowerCase().charAt(0);

        float discount;

        if (category == 'a') {
            discount = 60;
        }else if (category == 'b') {
            discount = 40;
        }else if (category == 'c') {
            discount = 20;
        }else if (category == 'd') {
            discount = 10;
        }else {
            System.out.println("Invalid category!");
            return;
        }

        float sp = mp - (mp * discount / 100);
        System.out.println("Selling price: " + sp);

        scan.close();
    }
}
