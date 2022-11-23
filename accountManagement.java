import java.util.ArrayList;
import java.util.Scanner;

/**
 * Allows customer accounts system to operate
 */
public class accountManagement {

	/**
	 * Creates a menu for the customer accounts system.
	 * @param customerAccounts
	 */
	public static void accountManagementMenu(ArrayList<account> customerAccounts) {
		Scanner scan = new Scanner(System.in);
		String menuOption = null;

		System.out.println("\n\n");
		System.out.println("Customer Managment Menu\n");
		System.out.println("(C)reate New Account");
		System.out.println("(U)pdate A Customer Account");
		System.out.println("(D)isplay All Customer Accounts");
		System.out.println("(S)earch for Cutsomer Account\n");
		System.out.println("(B)ack");

		do {
			System.out.println("Selection:");
			menuOption = scan.nextLine();
			switch (menuOption.trim()) {
				case "C":
					createCustomerAccount(customerAccounts);
					break;
				case "U":
					updateCustomerAccount(customerAccounts);
					break;
				case "D":
					reports.listAccounts(customerAccounts;)
					break;
				case "S":
					findCustomerAccount(customerAccounts);
					break;
				default:
					System.out.println("Invalid Selection\n");
					break;
			}
		} while (!menuOption.equals("B")); // quitting the program
	}
	// This is a mess herein..

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
	static void updateCustomerAccount() {
		// TODO - implement Account.updateCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * Searches accounts database for customer.
	 */
	static void findCustomerAccount() {
		// TODO - implement Account.findCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates a new account for a customer.
	 */
	static void createCustomerAccount() {
		// TODO - implement Account.createCustomerAccount
		throw new UnsupportedOperationException();
	}
}
