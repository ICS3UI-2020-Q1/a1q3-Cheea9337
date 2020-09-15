import java.util.Scanner;

/**
 * To calculate the cost of chargers, motherboards, and mice
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user how many chromebook chargers
    System.out.println("How many chromebook chargers?");

    // declare and initialize the charger cost constant
    final double CHARGER_COST = 34.99;

    // allows the user to give an amount of chargers
    int chargers = input.nextInt();

    // to muliply the user's input with the charger cost
    double chargersCost = CHARGER_COST * chargers;

    // ask the user how many motherboards
    System.out.println("How many motherboards?");

    // to declare and initialize the motherboard cost constant
    final double MOTHERBOARD_COST = 127.5;

    // allows the user to give an amount of motherboards
    int motherboards = input.nextInt();

    // to multiply the user's input with the motherboard cost
    double motherboardCost = MOTHERBOARD_COST * motherboards;

    // ask the user how many mice
    System.out.println("How many mice?");

    // to declare and initialize the mice cost constant
    final double MICE_COST = 18.0;

    // allows the user to give an amount of mice
    int mice = input.nextInt();

    // muliplys the user's input with the mice cost
    double miceCost = MICE_COST * mice;

    // to add the total cost of the three items
    double subtotal = motherboardCost + miceCost + chargersCost;

    // to get the tax of the cost of the three items
    double taxes = subtotal * 0.13;

    // to get the total of everything
    double total = subtotal + taxes;

    // to tell the user what the subtotal is
    System.out.println("Subtotal = $" + subtotal);

    // to tell the user the taxes cost
    System.out.println("Taxes = $" + taxes);

    // to tell the user the total cost
    System.out.println("Total Cost = $" + total);

  }
}
