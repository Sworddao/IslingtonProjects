import java.util.Scanner;

public class GpaToGrade{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your gpa (range: 0.0 to 4.0");
        double gpa = scan.nextDouble();
        
        String grade;
    
        if(gpa >= 3.6){
            grade = "A+";
        }else if(gpa >= 3.2 || gpa < 3.6){
            grade = "A";
        }else if(gpa < 3.2 || gpa > 2.6){
             grade = "B+";
        }else if(gpa < 2.6 || gpa > 1.0){
             grade = "Below average : C";
        }else{
             grade = "You failed : F";
        }
        
        System.out.println("Your gpa is :" + gpa + " and grade is : " + grade);
    }
}