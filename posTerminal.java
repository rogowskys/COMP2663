import java.util.Scanner;

public class posTerminal {
	// Main driver for posTerminal
	/**
	 * @param args
	 */
	public static void main(String[] args) {

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
					// do what you want
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

	public void generateReports() {
		// TODO - implement posTerminal.generateReports
		throw new UnsupportedOperationException();
	}

}