import java.util.ArrayList;

/**
 * Creates reports from Inventory, Transactions, Accounts.
 */
public class reports {

	/**
	 * Prints a list of transactions.
	 */
	public void listTransactions() {
		// TODO - implement reports.listTransactions
		throw new UnsupportedOperationException();
	}

	/**
	 * Prints a customer accounts list.
	 */
	public void listAccounts() {
		// TODO - implement reports.listAccounts
		throw new UnsupportedOperationException();
	}

	/**
	 * Prints a list of the non-media inventory list.
	 * @param inventoryToPrint non-media inventory list that will be printed
	 */
	public static void listInventory(ArrayList inventoryToPrint) {
		System.out.println("\n\nNon-media Inventory:");
		System.out.println("Description\tPrice\tOn Hand\tUPC");
		for (int j = 0; j < 3; j++) {
			System.out.println(inventoryToPrint.get(j));
		}
	}

	/**
	 * Prints a list of the media inventory list.
	 * @param inventoryToPrint media inventory list that will be printed
	 */
	public static void listMediaInventory(ArrayList inventoryToPrint) {
		System.out.println("\n\nMedia Inventory:");
		System.out.println("Title\t\t\t\tUPC\t\tPrice\tType");
		for (int i = 0; i < 4; i++) {
			System.out.println(inventoryToPrint.get(i));
		}
	}

}