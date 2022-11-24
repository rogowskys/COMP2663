import java.util.ArrayList;
import java.util.Scanner;

/**
 * Allows customer accounts system to operate
 */
public class accountManagement {

	/**
	 * Creates a menu for the customer accounts system.
	 * 
	 * @param customerAccounts
	 */
	public static void accountManagementMenu(ArrayList<account> customerAccounts) {
		Scanner scan = new Scanner(System.in);
		String menuOption = null;
		do {
			System.out.println("\n\n");
			System.out.println("_______________________");
			System.out.println("Customer Managment Menu");
			System.out.println("_______________________\n");
			System.out.println("(C)reate New Account");
			System.out.println("(U)pdate A Customer Account");
			System.out.println("(D)isplay All Customer Accounts");
			System.out.println("(S)earch for Cutsomer Account\n");
			System.out.println("(B)ack");

			System.out.println("Selection:");
			menuOption = scan.nextLine();
			switch (menuOption.trim()) {
				case "C":
					createCustomerAccount(customerAccounts, scan);
					break;
				case "U":
					updateCustomerAccount(customerAccounts, scan);
					break;
				case "D":
					reports.listAccounts(customerAccounts);
					break;
				case "S":
					findCustomerAccount(customerAccounts, scan);
					break;
				default:
					System.out.println("Invalid Selection\n");
					break;
			}
		} while (!menuOption.equals("B"));
	}

	/**
	 * Updates customer's account
	 * 
	 * @param customerAccounts
	 * @param scan
	 */
	static void updateCustomerAccount(ArrayList<account> customerAccounts, Scanner scan) {
		account accountToUpdate = findCustomerAccount(customerAccounts, scan);
		String fieldToUpdate = "";
		String menuSelection = "";

		do {
			System.out.println("\nSelect field to update:");
			System.out.println("(N)ame, (A)ddress, (P)hone Number, or (D)one");
			menuSelection = scan.nextLine();
			switch (menuSelection.trim()) {
				case "N":
					System.out.println("Existing Name: " + account.getCustomerName());
					System.out.println("New Name:");
					fieldToUpdate = scan.nextLine();
					System.out.println("\nUpdating to :" + fieldToUpdate);
					accountToUpdate.setCustomerName(fieldToUpdate);
					System.out.println("Done.");
					break;
				case "A":
					System.out.println("Existing Address: " + account.getCustomerAddress());
					System.out.println("New Address:");
					fieldToUpdate = scan.nextLine();
					System.out.println("\nUpdating to :" + fieldToUpdate);
					accountToUpdate.setCustomerAddress(fieldToUpdate);
					System.out.println("Done.");
					break;
				case "P":
					System.out.println("Existing Phone Number: " + account.getCustomerPhoneNumber());
					System.out.println("New Phone Number:");
					fieldToUpdate = scan.nextLine();
					System.out.println("\nUpdating to :" + fieldToUpdate);
					accountToUpdate.setCustomerPhoneNumber(fieldToUpdate);
					System.out.println("Done.");
					break;
			}

		} while (!menuSelection.equals("D"));
		System.out.println("\nUpdated Account Details:");
		System.out.println("Account No.\tCustomer Name\tPhone Number\tAccount Balance");
		System.out.println(accountToUpdate + "\n\n");

	}

	/**
	 * Searches accounts database for customer.
	 * 
	 * @param scan
	 * @param customerAccounts
	 */
	static account findCustomerAccount(ArrayList<account> customerAccounts, Scanner scan) {
		account searchCustomer;
		String searchSelection = "";
		String searchTerm = "";

		System.out.println("\n\nSearch by (N)ame or (P)hone number, or press Return to go back");
		searchSelection = scan.nextLine();
		if (searchSelection.equals("N")) {
			System.out.println("Name: 'Firstname Lastname'");
			searchTerm = scan.nextLine();
			for (int i = 0; i < customerAccounts.size(); i++) {
				searchCustomer = customerAccounts.get(i);
				if (searchCustomer.getCustomerName().equals(searchTerm)) {
					System.out.println("Customer Found:");
					System.out.println(searchCustomer);
					return searchCustomer;
				} else {
					System.out.println("Not found");
				}
			}
		} else if (searchSelection.equals("P")) {
			System.out.println("Phone Number: xxx-xxxx");
			searchTerm = scan.nextLine();
			for (int i = 0; i < customerAccounts.size(); i++) {
				searchCustomer = customerAccounts.get(i);
				if (searchCustomer.getCustomerPhoneNumber().equals(searchTerm)) {
					System.out.println("Customer Found:");
					System.out.println(searchCustomer);
					return searchCustomer;
				} else {
					System.out.println("Not found");
				}
			}
		}

		return null;
	}

	/**
	 * Creates a new account for a customer.
	 * 
	 * @param customerAccounts
	 * @param scan
	 */
	static void createCustomerAccount(ArrayList<account> customerAccounts, Scanner scan) {

		account newCustomer = new account();

		System.out.println("\nCreate a new customer account:\n");
		System.out.println("Customer Name: \"Firstname Lastname\"");
		newCustomer.setCustomerName(scan.nextLine());
		System.out.println("\nCustomer Address:");
		newCustomer.setCustomerAddress(scan.nextLine());
		System.out.println("\nPhone number:");
		newCustomer.setCustomerPhoneNumber(scan.nextLine());
		newCustomer.setAccountID(customerAccounts.size());

		customerAccounts.add(newCustomer);
		System.out.println("New Customer Added.\n\n");

	}
}
