import java.util.Scanner;

public class SwitchSellingPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the marked price: ");
        float mp = scan.nextFloat();

        System.out.print("Enter the category (A, B, C, D): ");
        char category = scan.next().toUpperCase().charAt(0);

        float discount;

        switch (category) {
            case 'A':
                discount = 60;
                break;
            case 'B':
                discount = 40;
                break;
            case 'C':
                discount = 20;
                break;
            case 'D':
                discount = 10;
                break;
            default:
                System.out.println("Invalid category!");
                scan.close();
                return;
        }

        float sp = mp - (mp * discount / 100);
        System.out.println("Selling price: " + sp);

        scan.close();
    }
}
