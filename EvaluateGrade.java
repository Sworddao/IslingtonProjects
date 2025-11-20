import java.util.Scanner;

public class EvaluateGrade{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your marks");
        int grade = scan.nextInt();
        
        String result = (grade >= 40) ? "\tPass" : "\nFail";
        }
    }
