import java.util.Scanner;

public class ChatCalci {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hello! I'm ChatCalci, your friendly calculator. What’s your name? ");
        String name = scan.nextLine();
        System.out.println("Nice to meet you, " + name + "!");

        while (true) {
            System.out.println("\nWhat would you like to do? (addition, subtraction, multiplication, division, or exit)");
            String op = scan.nextLine().toLowerCase();

            if (op.equals("exit")) {
                System.out.println("Goodbye, " + name + "! Have a great day!");
                break;
            }

            System.out.println("Please enter two numbers:");
            int a = scan.nextInt();
            int b = scan.nextInt();
            scan.nextLine(); 

            System.out.println("Thinking...");
            Thread.sleep(700);

            double result;
            switch (op) {
                case "addition":
                    result = a + b;
                    System.out.println("The sum of " + a + " and " + b + " is " + result);
                    break;
                case "subtraction":
                    result = a - b;
                    System.out.println("The difference between " + a + " and " + b + " is " + result);
                    break;
                case "multiplication":
                    result = a * b;
                    System.out.println("The product of " + a + " and " + b + " is " + result);
                    break;
                case "division":
                    if (b != 0) {
                        result = (double) a / b;
                        System.out.println("The division of " + a + " by " + b + " is " + result);
                    } else {
                        System.out.println("Division by zero isn’t allowed!");
                    }
                    break;
                default:
                    System.out.println("Sorry, Invalid Operation!.");
            }
        }

        scan.close();
    }
}
