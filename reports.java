import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates reports from Inventory, Transactions, Accounts.
 */
public class reports {

	public static void reportGenerationMenu() {
		Scanner scan = new Scanner(System.in);
		String menuOption;

		do {

			System.out.println("\n");
			System.out.println("_______________________");
			System.out.println("POS Reports Menu");
			System.out.println("_______________________\n");
			System.out.println("(Transaction Report");
			System.out.println("(C)ustomer Accounts Report");
			System.out.println("(M)edia Inventory Report");
			System.out.println("(N)on Media Inventory Report\n");
			System.out.println("(B)ack");

			System.out.println("Selection:");
			menuOption = scan.nextLine();
			switch (menuOption.trim()) {
				case "T":
					listTransactions();
					break;
				case "C":
					listAccounts(posTerminal.customerAccounts);
					break;
				case "M":
					listMediaInventory(posTerminal.mediaInventory);
					break;
				case "N":
					listInventory(posTerminal.inventory);
					break;
				default:
					System.out.println("Invalid Selection\n");
					break;
			}
		} while (!menuOption.equals("B"));
	}

	/**
	 * Prints a list of transactions.
	 */
	public static void listTransactions() {
		// TODO - implement reports.listTransactions
		throw new UnsupportedOperationException();
	}

	/**
	 * Prints a customer accounts list.
	 */
	public static void listAccounts(final ArrayList customerAccountList) {
		System.out.println("Customer Account List:\n");
		System.out.println("Account No.\tCustomer Name\tPhone Number\tAccount Balance");
		for (int i = 0; i < customerAccountList.size(); i++) {
			System.out.println(customerAccountList.get(i));
		}
	}

	/**
	 * Prints a list of the non-media inventory list.
	 * 
	 * @param inventoryToPrint non-media inventory list that will be printed
	 */
	public static void listInventory(final ArrayList inventoryToPrint) {
		System.out.println("\n\nNon-media Inventory:");
		System.out.println("Description\tPrice\tOn Hand\tUPC");
		for (int j = 0; j < inventoryToPrint.size(); j++) {
			System.out.println(inventoryToPrint.get(j));
		}
	}

	/**
	 * Prints a list of the media inventory list.
	 * 
	 * @param inventoryToPrint media inventory list that will be printed
	 */
	public static void listMediaInventory(final ArrayList inventoryToPrint) {
		System.out.println("\n\nMedia Inventory:");
		System.out.println("Title\t\t\t\tUPC\t\tPrice\tType");
		for (int i = 0; i < inventoryToPrint.size(); i++) {
			System.out.println(inventoryToPrint.get(i));
		}
	}

}