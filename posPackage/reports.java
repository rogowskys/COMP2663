/**
 * Reports class prints out all data in selected report type.
 *
 * Bugs: None that we are aware of.
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */
package posPackage;

import java.util.ArrayList;
import java.util.Scanner;

import posTerminal;

public class reports {

	/**
	 * Creates a menu for report options.
	 */
	public static void reportGenerationMenu() {
		Scanner scan = new Scanner(System.in);
		String menuOption;

		do {

			System.out.println("\n");
			System.out.println("POS Reports Menu");
			System.out.println("_______________________\n");
			System.out.println("(T)ransaction Report");
			System.out.println("(C)ustomer Accounts Report");
			System.out.println("(M)edia Inventory Report");
			System.out.println("(N)on Media Inventory Report\n");
			System.out.println("(B)ack");

			System.out.println("Selection:");
			menuOption = scan.nextLine();
			switch (menuOption.trim()) {
				case "T":
					listTransactions(posTerminal.transactionRegister);
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
	public static void listTransactions(final ArrayList transactionList) {
		System.out.println("\nTransaction Report");
		System.out.println("__________________");
		for (int i = 0; i < transactionList.size(); i++) {
			System.out.println(transactionList.get(i));
		}
	}

	/**
	 * Prints a customer accounts list.
	 */
	public static void listAccounts(final ArrayList customerAccountList) {
		System.out.println("\nCustomer Account List:\n");
		System.out.println("_______________________");
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
		System.out.println("\nNon-media Inventory:");
		System.out.println("_______________________");
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
		System.out.println("\nMedia Inventory:");
		System.out.println("_______________________");
		System.out.println("Title\t\t\t\tUPC\t\tPrice\tType");
		for (int i = 0; i < inventoryToPrint.size(); i++) {
			System.out.println(inventoryToPrint.get(i));
		}
	}

}