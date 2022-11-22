import java.util.ArrayList;
import java.util.Scanner;

public class posTerminal {
	public static ArrayList<mediaItem> mediaInventory = new ArrayList<>();
	public static ArrayList<nonMediaItem> inventory = new ArrayList<>();

	// Main driver for posTerminal
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Seed the 'database'
		fillDatabaseWithData();
		//

		Scanner scan = new Scanner(System.in); // Capturing the input
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
			System.out.println("C) (C)reate new sale/rental transaction");
			System.out.println("A)  Customer (A)ccount Management");
			System.out.println("S) (S)earch inventory");
			System.out.println("R)  Create new (R)eservation");
			System.out.println("P) (P)rint reports\n");
			System.out.println("Q) (Q)uit");
			menuOption = scan.next();
			switch (menuOption.trim()) {
				case "C":
					// do what you want
					break;
				case "A":
					manageCustomerAccount();
					break;
				case "S":
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
				// Add the rest of your cases
			}
		} while (!menuOption.equals("Q")); // quitting the program
		return;
	}

	public Transaction makeNewTransaction() {
		// TODO - implement posTerminal.makeNewTransaction
		throw new UnsupportedOperationException();
	}

	public void mediaSearch() {
		// TODO - implement posTerminal.mediaSearch
		throw new UnsupportedOperationException();
	}

	public Reservation createReservation() {
		// TODO - implement posTerminal.createReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param accountID
	 */
	public void searchForReservation(Account accountID) {
		// TODO - implement posTerminal.searchForReservation
		throw new UnsupportedOperationException();
	}

	public void endTransaction() {
		// TODO - implement posTerminal.endTransaction
		throw new UnsupportedOperationException();
	}

	public static void manageCustomerAccount() {
		customerManagement.customerManagementMenu();
	}

	/**
	 * 
	 * @param employeeID
	 */
	private static boolean loginUser(String employeeID) {
		if (Staff.isEmployeeID(employeeID)) {
			System.out.println("Welcome, " + employeeID);
			return true;
		} else {
			System.out.println("Invalid login.");
			return false;
		}
	}

	public static void generateReports() {
		reports.listInventory(inventory);
		reports.listMediaInventory(mediaInventory);
	}

	private static void fillDatabaseWithData() {
		mediaInventory.add(new mediaItem(575200221, 0.93, 2, "David and Lisa", "habitasse", "Web Jeske", "Gay Montford",
				"Alidia Maffione", 7, mediaType.DVD));
		mediaInventory.add(new mediaItem(41190319, 6.27, 8, "Jurassic Park",
				"nisi venenatis", "Melvin Rozenzweig", "Errol Monteath", "Eirena Daudray", 5, mediaType.DVD));
		mediaInventory.add(new mediaItem(57627136, 3.99, 9, "Top Gun ", "sit amet", "Cleavland Deny",
				"Ignazio Floyed", "Amory Finan", 6, mediaType.DVD));
		mediaInventory.add(new mediaItem(62362184, 4.75, 6, "Stuff and Dough", "vehicula",
				"Corrianne Hawton", "Jeniffer Cork", "Brinn Jedrzaszkiewicz", 2, mediaType.DVD));

		inventory.add(new nonMediaItem("Doritos 454g", 0, 5.99, 50));
		inventory.add(new nonMediaItem("Pepsi 2L", 0, 2.99, 75));
		inventory.add(new nonMediaItem("Fresh Popcorn", 0, 9.99, -1));
	}

}