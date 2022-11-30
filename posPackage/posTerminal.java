///////////////////////////////////////////////////////////////////////////////
//                  
// Title:            Blockblunder Video POS Terminal
// Purpose:          COMP2663 Assignment 4
// 
// Authors:          Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and
//                   Sean Rogowsky (134715r) <134715r@ACADIAU.CA> 
// Main Class File:  posTerminal.java
//
///////////////////////////////////////////////////////////////////////////////

/**
 * Driver class to execute the terminal.
 *
 * Bugs: None that we are aware of.
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */
package posPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class posTerminal {
	public static ArrayList<MediaItem> mediaInventory = new ArrayList<>();
	public static ArrayList<Item> inventory = new ArrayList<>();
	public static ArrayList<Account> customerAccounts = new ArrayList<>();
	public static ArrayList<Transaction> transactionRegister = new ArrayList<>();

	/**
	 * Main driver for the terminal.
	 * 
	 * @param args passes arguments from main
	 */
	public static void main(String[] args) {

		// Seed the 'database'
		fillDatabaseWithData();

		Scanner scan = new Scanner(System.in);
		String menuOption = null;
		boolean loggedIn = false;

		while (!loggedIn) {
			System.out.println("Blockblunder Video Rental POS Terminal System Program");
			System.out.println("\n\nUsername:");
			loggedIn = loginUser(scan.nextLine().trim());
		}

		do {
			System.out.println("\n\n");
			System.out.println("--- Main Menu ---");
			System.out.println("(S)ale/Rental Transaction");
			System.out.println("(C)ustomer Account Management");
			System.out.println("(M)anage inventory\t <Not Implemented>");
			System.out.println("(R)eservation\t <Not Implemented>");
			System.out.println("(P)rint reports\n");
			System.out.println("(Q)uit");
			menuOption = scan.next();
			switch (menuOption.trim()) {
				case "S":
					processTransactions();
					break;
				case "C":
					manageCustomerAccount();
					break;
				case "M":
					// do what you want
					break;
				case "R":
					// do what you want
					break;
				case "P":
					generateReports();
					break;
				default:
					break;
			}
		} while (!menuOption.equals("Q"));
	}

	/**
	 * Allows a customer account to be updated.
	 */
	public static void manageCustomerAccount() {
		accountManagement.accountManagementMenu(customerAccounts);
	}

	/**
	 * Allows reports to be created.
	 * Reports include: Inventory, Transactions, and Accounts
	 */
	public static void generateReports() {
		reports.reportGenerationMenu();
	}

	/**
	 * Allows system's user to enter their username to gain access.
	 * 
	 * @param employeeID username of employee using the system
	 */
	private static boolean loginUser(String employeeID) {
		if (Staff.isEmployeeID(employeeID)) {
			System.out.println("Welcome, " + employeeID + "\n");
			return true;
		} else {
			System.out.println("Invalid login.");
			return false;
		}
	}

	/**
	 * Creates the current sale transaction.
	 * 
	 * @return current transaction
	 */
	public static void processTransactions() {
		transactionManagement.transactionManagementMenu(transactionRegister);
	}

	/**
	 * Allows inventory to be modified.
	 */
	public void manageInventory() {
		// TODO - implement posTerminal.manageInventory

		throw new UnsupportedOperationException();
	}

	/**
	 * Allows a new reservation to be created.
	 * 
	 * @return reservation
	 */
	public void createReservation() {
		// TODO - implement posTerminal.createReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * Ability to search for a reservation
	 * 
	 * @param accountID ID number of account of customer
	 */
	public void searchForReservation(Account accountID) {
		// TODO - implement posTerminal.searchForReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates and stores data for system's database
	 */
	private static void fillDatabaseWithData() {
		// Make some inventory
		mediaInventory.add(new MediaItem(100, 0.93, 2, "David and Lisa", "habitasse", "Web Jeske", "Gay Montford",
				"Alidia Maffione", 7, MediaType.DVD));
		mediaInventory.add(new MediaItem(101, 6.27, 8, "Jurassic Park",
				"nisi venenatis", "Melvin Rozenzweig", "Errol Monteath", "Eirena Daudray", 5, MediaType.DVD));
		mediaInventory.add(new MediaItem(102, 3.99, 9, "Top Gun ", "sit amet", "Cleavland Deny",
				"Ignazio Floyed", "Amory Finan", 6, MediaType.DVD));
		mediaInventory.add(new MediaItem(103, 4.75, 6, "Stuff and Dough", "vehicula",
				"Corrianne Hawton", "Jeniffer Cork", "Brinn Jedrzaszkiewicz", 2, MediaType.DVD));

		// Make some more inventory
		inventory.add(new Item("Doritos 454g", 12, 5.99, 50));
		inventory.add(new Item("Pepsi 2L", 13, 2.99, 75));
		inventory.add(new Item("Fresh Popcorn", 14, 9.99, -1));

		// Make some customer accounts
		customerAccounts
				.add(new Account("Homer Simpson", "742 Evergreen Terrace", "867-5309", customerAccounts.size()));
				/**
				,---.
				,.'-.   \
			   ( ( ,'"""""-.
			   `,X          `.
			   /` `           `._
			  (            ,   ,_\
			  |          ,---.,'o `.
			  |         / o   \     )
			   \ ,.    (      .____,
				\| \    \____,'     \
			  '`'\  \        _,____,'
			  \  ,--      ,-'     \
				( C     ,'         \
				 `--'  .'           |
				   |   |         .O |
				 __|    \        ,-'_
				/ `L     `._  _,'  ' `.
			   /    `--.._  `',.   _\  `
			   `-.       /\  | `. ( ,\  \
			  _/  `-._  /  \ |--'  (     \
			 '  `-.   `'    \/\`.   `.    )
				   \  -hrr-    \ `.  |    |
				   */
		customerAccounts.add(new Account("Bill Gates", "1 Microsoft Way", "555-1234", customerAccounts.size()));
		customerAccounts.add(new Account("Big Customer", "Small House", "No phone", customerAccounts.size()));
		customerAccounts.add(new Account("Elon Musk", "1 Mars Way", "999-9999", customerAccounts.size()));
		// Add some overdue fees for Elon
		customerAccounts.get(3).setAccountBalance(4.99);


		}
}