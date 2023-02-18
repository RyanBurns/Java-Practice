/********************************************************************************************************************************************

Ryan Burns - x22201661 - 2023.02.18
A short, text-based adventure story game about the Irish legend Cú Chulainn where the user must make choices to continue the story.

**********************************************************************************************************************************************/


import java.util.Scanner;

public class CuChulainnTextAdventure {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Cú Chulainn Text Adventure Game!");
    System.out.println("Press 1 or 2 on to choose your path!\n");


    // Begin the story
    System.out.println("You are Cú Chulainn, the legendary warrior of Ulster.\n");
    System.out.println("One day, you hear about a great monster that has been terrorizing the countryside.");
    System.out.println("What do you do?\n");
    System.out.println("1. Go after the monster alone");
    System.out.println("2. Gather a group of warriors to go with you\n");

    int choice1 = input.nextInt();

    // First choice
    if (choice1 == 1 || choice1 == 2) {
      System.out.println("You set out to face the monster.");
      System.out.println("As you get closer, you realize it's a scary Banshee!");
      System.out.println("What do you do?\n");
      System.out.println("1. Fight the Banshee with your hurl");
      System.out.println("2. Use your sliotar to attack from a distance\n");

      int choice2 = input.nextInt();

      // Second choice
      if (choice2 == 1 || choice2 == 2) {
        System.out.println("You engage in battle with the Banshee.");
        System.out.println("It's a tough fight, but you manage to defeat the Banshee!");
        System.out.println("What do you do now?\n");
        System.out.println("1. Head to the pub to calm down after the ordeal");
        System.out.println("2. Continue exploring the area\n");

        int choice3 = input.nextInt();

        // Third choice
        if (choice3 == 1 || choice3 == 2) {
          System.out.println("As you head to the pub, along the way you stumble upon three angry leprachauns who want to rob you.");
          System.out.println("What do you do?\n");
          System.out.println("1. Pacify the situation by getting them drunk");
          System.out.println("2. Attack them\n");

          int choice4 = input.nextInt();

          // Fourth choice
          if (choice4 == 1) {
            System.out.println("You manage to convince the leprachauns to sit down and drink Guinness with you.");
            System.out.println("Violence has been avoided.\n");

            System.out.println("Congratulations, you have completed the game!");
          } else if (choice4 == 2) {
            System.out.println("You hit them with your hurl and carry on to the pub!.");
          } else {
            System.out.println("Invalid input.");
          }
        } else {
          System.out.println("Invalid input.");
        }
      } else {
        System.out.println("Invalid input.");
      }
    } else {
      System.out.println("Invalid input.");
    }
  }
}//end main