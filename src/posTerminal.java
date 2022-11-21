import java.util.Scanner;

public class posTerminal {
	private boolean loggedIn = false;
	private String softwareVersion = "1995";

	// Main driver for posTerminal
	public void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Capturing the input

		while (!loggedIn) {
			System.out.println("Blockblunder Video Rental POS Terminal System Program Version " + softwareVersion);
			System.out.println("\n\nUsername:");
			loggedIn = loginUser(scan.nextLine());

		}

		System.out.println("C) Create new cargo <name> <weight> <strength>");
		System.out.println("L) Load cargo from dock <stackIndex>");
		System.out.println("U) Unload cargo from ship <srcStackIndex>");
		System.out.println("M) Move cargo between stacks <srcStackIndex> <dstStackIndex>");
		System.out.println("K) Clear dock");
		System.out.println("P) Print ship stacks");
		System.out.println("S) Search for cargo <name>");
		System.out.println("Q) Quit");

		String options = null;

		do {
			options = scan.nextLine();
			switch (options.toUpperCase()) {
				case "C":
					// do what you want
					break;
				case "L":
					// do what you want
					break;
				case "U":
					// do what you want
					break;
				case "M":
					break;
				// Add the rest of your cases
			}
		} while (!options.equals("Q")); // quitting the program
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
	public void searchForReservation(Customer accountID) {
		// TODO - implement posTerminal.searchForReservation
		throw new UnsupportedOperationException();
	}

	public void endTransaction() {
		// TODO - implement posTerminal.endTransaction
		throw new UnsupportedOperationException();
	}

	public void createCustomerAccount() {
		// TODO - implement posTerminal.createCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param employeeID
	 */
	public boolean loginUser(String employeeID) {
		if (Staff.isEmployeeID(employeeID)) {
			System.out.println("Welcome, " + employeeID);
			return true;
		} else {
			System.out.println("Invalid login.");
			return false;
		}
	}

	public Account operation() {
		// TODO - implement posTerminal.operation
		throw new UnsupportedOperationException();
	}

	public void generateReports() {
		// TODO - implement posTerminal.generateReports
		throw new UnsupportedOperationException();
	}

}