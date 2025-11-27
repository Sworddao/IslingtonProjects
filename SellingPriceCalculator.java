import java.util.Scanner;

public class SellingPriceCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the marked price: ");
        float mp = scan.nextFloat();

        System.out.print("Enter the category (A, B, C, D): ");
        char category = scan.next().toLowerCase().charAt(0);

        float discount;

        if (category == 'A') {
            discount = 60;
        } else if (category == 'B') {
            discount = 40;
        } else if (category == 'C') {
            discount = 20;
        } else if (category == 'D') {
            discount = 10;
        } else {
            System.out.println("Invalid category!");
            return;
        }

        float sp = mp - (mp * discount / 100);
        System.out.println("Selling price: " + sp);

        scan.close();
    }
}
