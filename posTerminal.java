import java.util.ArrayList;
import java.util.Scanner;

/**
 * Allows the system to operate.
 */
public class posTerminal {
	public static ArrayList<mediaItem> mediaInventory = new ArrayList<>();
	public static ArrayList<Item> inventory = new ArrayList<>();
	public static ArrayList<account> customerAccounts = new ArrayList<>();
	public static ArrayList<transaction> transactionRegister = new ArrayList<>();

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
			System.out.println("(N)ew sale/rental transaction");
			System.out.println("(C)ustomer Account Management");
			System.out.println("(M)anage inventory");
			System.out.println("(R)eservation");
			System.out.println("(P)rint reports\n");
			System.out.println("(Q)uit");
			menuOption = scan.next();
			switch (menuOption.trim()) {
				case "N":
					makeNewTransaction();
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
	 * Allows an account to be updated.
	 */
	public static void manageCustomerAccount() {
		accountManagement.accountManagementMenu(customerAccounts);
	}

	/**
	 * Allows reports to be created.
	 * Reports include: Inventory, Transactions,
	 */
	public static void generateReports() {
		reports.reportGenerationMenu();
	}

	/**
	 * Allows system user to enter their username to have access.
	 * 
	 * @param employeeID username of employee trying to use the system
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
	public static void makeNewTransaction() {
		transactionManagement.transactionManagementMenu(transactionRegister);
	}

	/**
	 *
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
	public void searchForReservation(account accountID) {
		// TODO - implement posTerminal.searchForReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates and stores data for system's database
	 */
	private static void fillDatabaseWithData() {
		// Make some inventory
		mediaInventory.add(new mediaItem(100, 0.93, 2, "David and Lisa", "habitasse", "Web Jeske", "Gay Montford",
				"Alidia Maffione", 7, mediaType.DVD));
		mediaInventory.add(new mediaItem(101, 6.27, 8, "Jurassic Park",
				"nisi venenatis", "Melvin Rozenzweig", "Errol Monteath", "Eirena Daudray", 5, mediaType.DVD));
		mediaInventory.add(new mediaItem(102, 3.99, 9, "Top Gun ", "sit amet", "Cleavland Deny",
				"Ignazio Floyed", "Amory Finan", 6, mediaType.DVD));
		mediaInventory.add(new mediaItem(103, 4.75, 6, "Stuff and Dough", "vehicula",
				"Corrianne Hawton", "Jeniffer Cork", "Brinn Jedrzaszkiewicz", 2, mediaType.DVD));

		// Make some more inventory
		inventory.add(new Item("Doritos 454g", 12, 5.99, 50));
		inventory.add(new Item("Pepsi 2L", 13, 2.99, 75));
		inventory.add(new Item("Fresh Popcorn", 14, 9.99, -1));

		// Make some customer accounts
		customerAccounts
				.add(new account("Homer Simpson", "742 Evergreen Terrace", "867-5309", customerAccounts.size()));
		customerAccounts.add(new account("Bill Gates", "1 Microsoft Way", "555-1234", customerAccounts.size()));
		customerAccounts.add(new account("Big Customer", "Small House", "No phone", customerAccounts.size()));
		customerAccounts.add(new account("Elon Musk", "1 Mars Way", "999-9999", customerAccounts.size()));
		// Add some overdue fees for Elon
		customerAccounts.get(3).setAccountBalance(4.99);


		}
}