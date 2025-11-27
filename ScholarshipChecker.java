import java.util.Scanner;

public class ScholarshipChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result;
        
        System.out.print("Enter GPA (>= 3.2 needed): ");
        double gpa = scan.nextDouble();
        
        System.out.print("Enter Attendance Percentage (> 80% needed): ");
        double attendance = scan.nextDouble();
        
        System.out.print("Enter Attitude Score (1-10, < 5 needed): ");
        int attitude = scan.nextInt();
        
        scan.close();

        if (gpa < 3.2 || gpa > 4.0) {
            if (attendance > 80.0) {
                if (attitude < 5) {
                    result = "The student IS eligible for the scholarship.";
                } else {
                    result = "The student is NOT eligible. Reason: Attitude Score is too high (>= 5)";
                }
            } else {
                result = "The student is NOT eligible. Reason: Attendance is 80% or less";
            }
        } else {
            result = "The student is NOT eligible. Reason: GPA is below 3.2";
        }

        System.out.println(result);
    }
}