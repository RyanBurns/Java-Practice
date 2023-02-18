import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: "); //prompts the user to enter a year
        int year = input.nextInt();
        
        boolean isLeapYear = false;
        
        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // Check if the year is divisible by 100
            if (year % 100 == 0) {
                // Check if the year is divisible by 400
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}