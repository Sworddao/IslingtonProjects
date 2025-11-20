/*import java.util.Scanner;

public class ScanMath{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any number");
        int num = input.nextInt();
        
        System.out.println("Enter another number");
        int annum = input.nextInt();
        
        int sum = num + annum;
        
        System.out.println("The sum of the two number is " + sum +  ".");
        input.close();
        
        
        
    }
}*/

import java.util.Scanner;

public class ScanMath{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter any number");
        int a  = scan.nextInt();
        
        System.out.println("Enter another number");
        int b = scan.nextInt();
        
        if(a > b){
            System.out.println(a + "is greater than " + b);
        }
        else if(a == b){
            System.out.println(a + " and " + b + " are equal. ");
        }
        else{
            System.out.println(b + "is greater than " + a);
        }
    }
}