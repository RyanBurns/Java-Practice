/********************************************************************************************************************************************

Ryan Burns - x22201661 - 2023.02.17
A Java Hotel booking application that allows a user to enter their age, name and how many nights they want to stay.
The app will then calculate the total cost of the stay
Only 18+ can book a room.

**********************************************************************************************************************************************/

import java.util.Scanner;

public class bookHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for name, number of nights and age
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of nights: ");
        int numNights = scanner.nextInt();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate total cost
        int roomCost = 90;
        int totalCost = roomCost * numNights;

        // Confirm booking if user is at least 18
        if (age >= 18) {
            System.out.println("Booking confirmed for " + name);
            System.out.println("Total cost: " + totalCost + " Euro");
        } else {
            System.out.println("Booking is NOT CONFIRMED. You must be at least 18 years old!");
        }
    }
}
