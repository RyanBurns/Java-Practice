/********************************************************************************************************************************************

Ryan Burns - x22201661 - 2023.02.18
A Java application that allows a user to enter their course programme code and year of study.
The app will then display a message showing where their party venue is.

**********************************************************************************************************************************************/

import java.util.Scanner;

public class studentsUnionBigNightOut {
    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their programme code and year of study
        System.out.print("Please enter your programme code: ");
        String programmeCode = scanner.nextLine().toUpperCase();
        System.out.print("Please enter your year of study: ");
        int yearOfStudy = scanner.nextInt();

        // Determine the venue based on the programme code and year of study
        String venue;
        if (yearOfStudy == 1 && programmeCode.equals("HDAIML")) {
            venue = "Lagoona";
        } else if (yearOfStudy == 1 && programmeCode.equals("HDBC")) {
            venue = "Harbourmaster";
        } else if (yearOfStudy == 2 && programmeCode.equals("HDAIML")) {
            venue = "Harbourmaster";
        } else if (yearOfStudy == 2 && programmeCode.equals("HDBC")) {
            venue = "Lagoona";
        } else {
            venue = "Unknown";
        }

        // Output location/venue to the user
        if (venue.equals("Unknown")) {
            System.out.println("I'm sorry, I couldn't determine the venue for your big night out. You probably entered the wrong information!");
        } else {
            System.out.println("Your big night out will be at the " + venue + " venue. Have fun!");
        }
    }
}