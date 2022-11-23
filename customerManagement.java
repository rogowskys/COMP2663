import java.util.Scanner;

/**
 * Allows customer accounts system to operate
 */
public class customerManagement {

    /**
     * Creates a menu for the customer accounts system.
     */
    public static void customerManagementMenu() {
        Scanner scan = new Scanner(System.in); // Capturing the input
        String menuOption = null;

        System.out.println("\n\n");
        System.out.println("Customer Managment Menu");
        System.out.println("Q) (Q)uit");

        do {
            menuOption = scan.nextLine();
            switch (menuOption) {
                case "C":
                    // do what you want
                    break;
                case "A":
                    // do what you want
                    break;
  
                default:
                    break;
                // Add the rest of your cases
            }
        } while (!menuOption.equals("Q")); // quitting the program
    }
}
