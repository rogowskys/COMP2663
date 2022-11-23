import java.util.Scanner;

/**
 * Allows customer accounts system to operate
 */
public class accountManagement {

    /**
     * Creates a menu for the customer accounts system.
     */
    public static void accountManagementMenu() {
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
    //This is a mess herein..

	/**
	 * Checks account for reservation.
	 */
	void reservationSearch() {
		// TODO - implement Account.reservationSearch
		throw new UnsupportedOperationException();
	}

	/**
	 * Updates customer's account
	 */
	void updateCustomerAccount() {
		// TODO - implement Account.updateCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * Searches accounts database for customer.
	 */
	void findCustomerAccount() {
		// TODO - implement Account.findCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates a new account for a customer.
	 */
	void createCustomerAccount() {
		// TODO - implement Account.createCustomerAccount
		throw new UnsupportedOperationException();
	}
}
