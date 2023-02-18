/********************************************************************************************************************************************

Ryan Burns - x22201661 - 2023.02.17
A Java application that allows a user to enter their age and blood type. (A, AB, B, O)
The app will then display a message outlining which blood groups the user can donate to and receive from.
Only 18+ can donate.

**********************************************************************************************************************************************/

import java.util.Scanner;

public class Blood {
    private int age;
    private String bloodType;

    // Constructor method that initializes the age and bloodType fields of a Blood object
    public Blood(int age, String bloodType) {
        this.age = age;
        this.bloodType = bloodType;
    }

    // Getter method that returns the blood type of a Blood object
    public String getBloodType() {
        return bloodType;
    }

    // Method that returns a message about which blood types a person with the given age and blood type can donate blood to
    public String getDonationMessage() {
        if (age < 18) { // If the person is under 18, they cannot donate blood
            return "You must be 18 or older to donate blood.";
        } else {
            String message = "You can donate blood to: ";
            if (bloodType.equals("A")) { // If the person has blood type A, they can donate blood to types A and AB
                message += "A, AB";
            } else if (bloodType.equals("B")) { // If the person has blood type B, they can donate blood to types B and AB
                message += "B, AB";
            } else if (bloodType.equals("AB")) { // If the person has blood type AB, they can donate blood to type AB
                message += "AB";
            } else if (bloodType.equals("O")) { // If the person has blood type O, they can donate blood to all blood types
                message += "A, B, AB, O";
            } else { // If the person has an invalid blood type, return an error message
                message = "Invalid blood type.";
            }
            return message;
        }
    }

    // Method that returns a message about which blood types a person with the given blood type can receive blood from
    public String getReceiveMessage() {
        String message = "You can receive blood from: ";
        if (bloodType.equals("A")) { // If the person has blood type A, they can receive blood from types A and O
            message += "A, O";
        } else if (bloodType.equals("B")) { // If the person has blood type B, they can receive blood from types B and O
            message += "B, O";
        } else if (bloodType.equals("AB")) { // If the person has blood type AB, they can receive blood from all blood types
            message += "A, B, AB, O";
        } else if (bloodType.equals("O")) { // If the person has blood type O, they can receive blood only from type O
            message += "O";
        } else { // If the person has an invalid blood type, return an error message
            message = "Invalid blood type.";
        }
        return message;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left after the previous input
        System.out.print("Enter your blood type (A, B, AB, or O): ");
        String bloodType = scanner.nextLine().toUpperCase(); // Convert the input to uppercase to avoid case sensitivity issues

        Blood blood = new Blood(age, bloodType);
        System.out.println(blood.getDonationMessage());
        System.out.println(blood.getReceiveMessage());
    }
}