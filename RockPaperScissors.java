/********************************************************************************************************************************************

Ryan Burns - x22201661 - 2023.02.17
A Rock, Paper, Scissors Java application that uses JOptionPane. User v PC

**********************************************************************************************************************************************/

import javax.swing.JOptionPane;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create an array of options for the user to choose from
        Object[] options = {"Rock", "Paper", "Scissors"};

        // Prompt the user to choose an option and store the result as an integer
        int userChoice = JOptionPane.showOptionDialog(
                null, // Parent component, null for default
                "Choose one:", // Prompt message
                "Rock Paper Scissors", // Dialog title
                JOptionPane.YES_NO_CANCEL_OPTION, // Option type
                JOptionPane.PLAIN_MESSAGE, // Message type
                null, // Icon, null for default
                options, // Options array
                null // Default option, null for none
        );

        // Generate a random integer between 1 and 3 to represent the computer's choice
        int computerChoice = (int) (Math.random() * 3) + 1;

        // Convert the user and computer choices to their corresponding string values
        String userChoiceString = options[userChoice-1].toString();
        String computerChoiceString = options[computerChoice-1].toString();

        // Construct the output message with the user and computer choices
        String message = "You chose " + userChoiceString + ", the computer chose " + computerChoiceString + "\n";

        // Check if the user and computer choices are the same (a draw)
        if (userChoice == computerChoice) {
            message += "Draw!";
        }
        // Check if the user wins
        else if (userChoice == 1 && computerChoice == 3 || userChoice == 2 && computerChoice == 1 || userChoice == 3 && computerChoice == 2) {
            message += "You win!";
        }
        // Otherwise, the computer wins
        else {
            message += "You lose!";
        }

        // Display the result message in a dialog box
        JOptionPane.showMessageDialog(
                null, // Parent component, null for default
                message, // Message to display
                "Result", // Dialog title
                JOptionPane.INFORMATION_MESSAGE // Message type
        );
    }
}
