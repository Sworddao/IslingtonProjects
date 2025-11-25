import java.util.Scanner;

public class MathOperations{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        // arithematic 
        System.out.println("Enter any two number");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a+b);

        //Unary (post - increment and pre-increment operators)

        System.out.println(a++);
        System.out.println(++b);

        //Assignment operators

        a = b;
        System.out.println(b);

        // Relational

        if(a>=b){
            System.out.println(a + " is greater than " + b);
        }
        else{
            System.out.println(b + "is greater than " + a);
        }

        //Logical Operators

        System.out.println((a == b) || (a > b));

        // Ternary Operator

        System.out.println("Enter your age");
        int age = scan.nextInt();
        
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age " + age + " is: " + result);

    }
}